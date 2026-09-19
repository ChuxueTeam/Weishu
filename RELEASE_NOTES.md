# Weishu 1.0.0 · 发布文案

> 本文件包含两套文案：**GitHub Release 说明**（开发者/技术受众）与**应用商店上架文案**（普通用户受众）。直接按需复制。

---

## 一、GitHub Release 说明

### Weishu v1.0.0

首个版本。

Weishu（𣻷澍）是一个原生 Android 多供应商 LLM 聊天客户端，基于 [RikkaHub](https://github.com/rikkahub/rikkahub)（AGPL-3.0）修改而来。

**版本信息**

- 应用名：Weishu / 𣻷澍
- 包名：`com.sevensoft.weishu`
- 版本：1.0.0（versionCode 1）
- 许可：AGPL-3.0
- 最低系统：Android 8.0（API 26）

**功能**

- 多 AI 供应商：自带 API Key、地址与模型，兼容 OpenAI / Google / Anthropic 接口
- 网页阅读：把网址交给模型，直接抓取正文，无需搜索服务
- 多模态输入：图片、文本、PDF、DOCX
- MCP 支持、消息分支、Markdown 渲染（代码高亮 / LaTeX / Mermaid）
- 搜索（Exa、Tavily、智谱、LinkUp、Brave、Perplexity 等）
- 记忆、AI 翻译、提示词变量、供应商二维码导入导出
- Material You 设计，深色模式

**相对上游的改动**

- 更名并更换包名为 `com.sevensoft.weishu`，更换应用图标
- 移除 Firebase Analytics / Crashlytics
- 移除带推广/返利性质的第三方供应商与推荐列表
- 重排设置结构，隐藏部分设置入口
- 新增网页阅读工具
- 加载动画替换为 Material 3 规范样式

**构建**

无需 `google-services.json`；配置 `local.properties` 指向 Android SDK 后执行：

```bash
./gradlew :app:assembleDebug
```

**许可与来源**

本项目以 AGPL-3.0 授权。原始版权声明与许可全文予以保留，改动清单见 `NOTICE`。本分支与 RikkaHub 项目无从属关系。

---

## 二、应用商店上架文案

### 中文

**应用名称**：Weishu（𣻷澍）

**简短描述**（80 字以内）
> 自带 API Key 的原生 Android AI 聊天客户端，支持多家模型供应商、网页阅读与多模态输入。

**完整描述**
> Weishu（𣻷澍）是一款原生 Android 的 AI 聊天客户端。它不内置模型，而是让你接入自己的服务：任何兼容 OpenAI、Google Gemini 或 Anthropic 接口的服务商，填上 API Key、地址与模型即可使用。
>
> 主要功能：
> • 多供应商自由切换，模型与参数随手配置
> • 网页阅读：把网址交给 AI，它会直接打开页面并读取内容
> • 多模态输入：图片、文本、PDF、DOCX
> • MCP 工具接入、消息分支、Markdown 渲染（代码高亮 / 公式 / 流程图）
> • 联网搜索、类 ChatGPT 记忆、AI 翻译、供应商二维码导入导出
> • Material You 设计，跟随系统深浅色
>
> 你的 API Key 与聊天数据保存在本机，不会上传到第三方服务器。
>
> 开源项目，基于 AGPL-3.0 授权。

**更新说明（1.0.0）**
> 首个版本。

### English

**App name**: Weishu

**Short description** (≤80 chars)
> A native Android AI chat client. Bring your own API key, providers, web reading and multimodal input.

**Full description**
> Weishu is a native Android AI chat client. It ships without models — you connect your own: any OpenAI, Google Gemini or Anthropic compatible endpoint works once you add the API key, base URL and models.
>
> Highlights:
> • Switch freely between multiple providers; configure models and parameters
> • Web reading: hand the model a URL and it opens the page and reads the content
> • Multimodal input: images, text, PDF, DOCX
> • MCP tools, message branching, Markdown rendering (code, LaTeX, Mermaid)
> • Web search, ChatGPT-style memory, AI translation, QR provider import/export
> • Material You design with dark mode
>
> Your API keys and chats stay on your device and are not uploaded to third-party servers.
>
> Open source, licensed under AGPL-3.0.

**What's new (1.0.0)**
> First release.

---

## 三、上架前清单（合规相关）

- [ ] 商店"开源许可"一栏填写 AGPL-3.0，并给出源码仓库地址
- [ ] 公开源码仓库（https://github.com/ChuxueTeam/Weishu，含 `LICENSE`、`NOTICE` 与完整对应源码）
- [ ] Release 附件同时提供源码压缩包（对应本次 APK 的源码快照）
- [ ] 隐私政策中说明：不采集数据（Firebase 已移除）、API Key 与聊天数据仅存本机
- [ ] 应用内保留可访问的许可 / 源码入口
