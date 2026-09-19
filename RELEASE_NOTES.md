# Weishu v1.0.0

Weishu（𣻷澍）首个正式版本。

一款原生 Android 的多供应商 AI 聊天客户端。它不内置模型，而是让你接入自己的服务：任何兼容
OpenAI、Google Gemini 或 Anthropic 接口的服务商，填上 API Key、地址与模型即可使用。API Key
与聊天记录只保存在本机。

> 「𣻷澍」这个名字来自一个人的名字。

---

## 版本信息

| 项目 | 值 |
|---|---|
| 应用名 | Weishu（简体中文显示为 𣻷澍） |
| 包名 | `com.sevensoft.weishu` |
| 版本 | 1.0.0（versionCode 1） |
| 最低系统 | Android 8.0（API 26） |
| 目标 SDK | 37 |
| 许可 | AGPL-3.0 |

## 亮点

- 🔄 **多供应商**：自带 API Key，兼容 OpenAI / Google / Anthropic 接口，模型与参数随手配置
- 🌐 **网页阅读**：把网址交给模型，它会直接打开页面并读取正文，不依赖搜索服务
- 🖼️ **多模态输入**：图片、文本文档、PDF、DOCX
- 🧩 **可定制的助手**：系统提示词、工具、MCP 接入
- 🪾 **消息分支**：同一轮对话可分叉探索不同回答
- 📝 **完整 Markdown**：代码高亮、LaTeX 公式、表格、Mermaid 流程图
- 🔍 **联网搜索**：Exa、Tavily、智谱、LinkUp、Brave、Perplexity 等
- 🧠 **记忆与翻译**：类 ChatGPT 的记忆、AI 翻译、提示词变量
- 🎨 **Material You**：跟随系统取色，支持深色模式

## 下载

按设备架构选择：

| 文件 | 适用 |
|---|---|
| `app-arm64-v8a-*.apk` | 绝大多数手机 |
| `app-universal-*.apk` | 全架构通用，拿不准就选这个 |
| `app-x86_64-*.apk` | 模拟器 |

## 安装后第一步

进入「设置 → 模型与服务」，添加一个供应商，填入自己的 API Key、接口地址和模型名，即可开始对话。

## 与上游 RikkaHub 的关系

本版本基于 [RikkaHub](https://github.com/rikkahub/rikkahub)（同为 AGPL-3.0）修改而来，主要改动：

- 更名并更换包名为 `com.sevensoft.weishu`，更换应用图标
- 移除 Firebase Analytics / Crashlytics
- 移除带推广性质的第三方供应商与推荐列表，移除赞助接口与捐赠页
- 移除上游的更新检查、内置搜索服务与官网链接
- 新增网页阅读工具
- 加载动画替换为 Material 3 规范样式
- 重排设置结构，隐藏部分设置入口

由于包名不同，Weishu 可与上游 RikkaHub 并存安装，两者的数据互不通用。

## 许可与来源

本项目以 [GNU Affero 通用公共许可证第三版](LICENSE)（AGPL-3.0）授权。原始版权声明予以保留，
改动清单见 [NOTICE](NOTICE)。本分支为独立衍生作品，与 RikkaHub 项目无从属关系，未获其背书或支持。

---

# Weishu v1.0.0 (English)

The first release of Weishu.

A native Android multi-provider AI chat client. It ships without models: connect any OpenAI,
Google Gemini or Anthropic compatible endpoint with your own API key, base URL and models.
Your API keys and chats stay on your device.

> The Chinese name 𣻷澍 comes from a person's name.

**Version**

- App name: Weishu
- Package: `com.sevensoft.weishu`
- Version: 1.0.0 (versionCode 1)
- Minimum: Android 8.0 (API 26), target SDK 37
- License: AGPL-3.0

**Highlights**

- Multiple providers — bring your own API key; OpenAI / Google / Anthropic compatible
- Web reading — give the model a URL and it opens the page and reads the content
- Multimodal input — images, text documents, PDF, DOCX
- Customizable assistants — system prompts, tools, MCP
- Message branching, full Markdown rendering (code, LaTeX, Mermaid)
- Web search, memory, AI translation, prompt variables
- Material You design with dark mode

**Download**

Pick the APK for your device: `arm64-v8a` for most phones, `universal` if unsure,
`x86_64` for emulators.

**Then**

Open Settings → Models & Services, add a provider with your own API key, base URL and
model, and start chatting.

**Relationship to RikkaHub**

This release is a modified fork of [RikkaHub](https://github.com/rikkahub/rikkahub), also
licensed under AGPL-3.0. It renames the app and package, removes the promotional providers,
the sponsor API and donation page, the Firebase integration, the upstream update checker,
the built-in search service and the upstream website links, and adds a web-page reading
tool. Because the package name differs, it installs alongside RikkaHub and the two do not
share data.

**License**

Licensed under the GNU Affero General Public License v3.0. See [LICENSE](LICENSE) and
[NOTICE](NOTICE). This fork is an independent derivative work and is not affiliated with
the RikkaHub project.
