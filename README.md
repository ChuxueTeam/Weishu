<div align="center">
  <img src="docs/icon.png" alt="App Icon" width="100" />
  <h1>Weishu · 𣻷澍</h1>

A native Android LLM chat client that works with multiple providers 🤖💬

English | [简体中文](README_ZH_CN.md) | [繁體中文](README_ZH_TW.md)
</div>

## ✨ Features

- 🎨 Material You design and 🌙 dark mode
- 🔄 Multiple AI providers: bring your own API key, URL and models (any OpenAI, Google
  or Anthropic compatible endpoint)
- 🖼️ Multimodal input (image, text document, PDF, DOCX)
- 🌐 Read a web page: give the model a URL and it opens the page and reads its content,
  without needing a search service
- 🛠️ MCP support
- 📝 Markdown rendering with code highlighting, LaTeX formulas, tables and Mermaid
- 🪾 Message branching
- 🔍 Search capabilities (Exa, Tavily, Zhipu, LinkUp, Brave, Perplexity, etc.)
- 🧩 Prompt variables (model name, time, etc.)
- 🤳 QR code export and import for providers
- 🧠 ChatGPT-like memory
- 📝 AI translation
- 🌐 Custom HTTP request headers and request bodies
- 💌 Silly Tavern character card import

## 🚀 Build

Requirements:

- Android Studio (or the Android SDK command line tools)
- JDK 17 or newer
- Android SDK with platform 37 and build-tools 36

The Firestore / Firebase integration of the upstream project has been removed in this
fork, so **no `google-services.json` is required** to build.

Create a `local.properties` at the repository root pointing at your SDK:

```properties
sdk.dir=/path/to/AndroidSDK
```

Then build:

```bash
# Linux / macOS
./gradlew :app:assembleDebug

# Windows
gradlew.bat :app:assembleDebug
```

Output APKs are written to `app/build/outputs/apk/debug/`.

## 🧱 Project structure

| Module | Responsibility |
|---|---|
| `app` | Android application, UI and feature wiring |
| `ai` | Provider abstraction (OpenAI / Google / Anthropic) and streaming |
| `search` | Web search service integrations |
| `speech` | TTS / ASR |
| `document` | Document parsing |
| `highlight` | Code highlighting |
| `material3` | Material 3 theming helpers |
| `workspace` | proot-based Linux workspace |
| `oauth` | OAuth loopback helper |
| `videogen` | Video generation |
| `web`, `web-ui` | Local web UI assets |
| `common` | Shared utilities |

## 📄 License

This project is licensed under the [GNU Affero General Public License v3.0](LICENSE)
(AGPL-3.0).

Source code: <https://github.com/ChuxueTeam/Weishu>

## 🙏 Attribution

Weishu is a modified fork of [RikkaHub](https://github.com/rikkahub/rikkahub), which is
also licensed under AGPL-3.0. The original copyright notices are retained. See
[NOTICE](NOTICE) for the list of modifications.

This fork is an independent derivative work. It is not affiliated with, endorsed by, or
supported by the RikkaHub project, and it claims no rights to the "RikkaHub" name or
logo.
