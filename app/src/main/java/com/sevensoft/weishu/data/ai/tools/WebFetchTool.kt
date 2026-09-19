package com.sevensoft.weishu.data.ai.tools

import com.sevensoft.weishu.ai.core.InputSchema
import com.sevensoft.weishu.ai.core.Tool
import com.sevensoft.weishu.ai.ui.UIMessagePart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import okhttp3.OkHttpClient
import okhttp3.Request
import org.jsoup.Jsoup

private const val MAX_CHARS = 20_000

/**
 * 让 AI 直接访问用户给出的网址，无需依赖搜索服务。
 * 抓取页面并转成可读正文，供模型阅读。
 */
fun createWebFetchTools(client: OkHttpClient): List<Tool> = listOf(
    Tool(
        name = "open_url",
        description = """
            Open a specific URL and return its readable text content.
            Use this whenever the user provides a link (or asks you to read/visit a page) and you need
            the actual page content. This does not require any search service.
            Only fetch URLs the user gave you or that are clearly relevant to the request.
            Page text is truncated when too long; prefer pages that contain the needed information.
        """.trimIndent(),
        parameters = {
            InputSchema.Obj(
                properties = buildJsonObject {
                    put("url", buildJsonObject {
                        put("type", "string")
                        put("description", "Absolute http/https URL to open")
                    })
                },
                required = listOf("url")
            )
        },
        execute = { args ->
            val url = args.jsonObject["url"]?.jsonPrimitive?.content?.trim().orEmpty()
            require(url.startsWith("http://") || url.startsWith("https://")) {
                "Invalid url: $url"
            }
            val result = withContext(Dispatchers.IO) {
                val request = Request.Builder()
                    .url(url)
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .header("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0 Mobile Safari/537.36")
                    .build()
                client.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) {
                        error("HTTP ${response.code} while opening $url")
                    }
                    val body = response.body?.string().orEmpty()
                    val finalUrl = response.request.url.toString()
                    buildString {
                        val doc = Jsoup.parse(body, finalUrl)
                        doc.select("script,style,noscript,svg,iframe,template").remove()
                        val title = doc.title()
                        if (title.isNotBlank()) {
                            appendLine("Title: $title")
                        }
                        appendLine("URL: $finalUrl")
                        appendLine()
                        append(doc.body()?.text().orEmpty())
                    }
                }
            }
            val truncated = if (result.length > MAX_CHARS) {
                result.take(MAX_CHARS) + "\n\n[content truncated]"
            } else {
                result
            }
            listOf(UIMessagePart.Text(truncated.ifBlank { "[empty page]" }))
        }
    )
)
