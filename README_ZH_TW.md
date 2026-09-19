<div align="center">
  <img src="docs/icon.png" alt="App Icon" width="100" />
  <h1>Weishu · 𣻷澍</h1>

原生 Android 多供應商 LLM 聊天客戶端 🤖💬

> 「𣻷澍」這個名字來自一個人的名字。

[English](README_EN.md) | [简体中文](README.md) | 繁體中文
</div>

## ✨ 功能

- 🎨 Material You 設計，🌙 深色模式
- 🔄 多 AI 供應商：自帶 API Key、位址與模型（相容 OpenAI / Google / Anthropic 介面）
- 🖼️ 多模態輸入（圖片、文字文件、PDF、DOCX）
- 🌐 網頁閱讀：把網址交給模型，它會直接開啟並讀取頁面內容，無需搜尋服務
- 🛠️ MCP 支援
- 📝 Markdown 渲染，含程式碼高亮、LaTeX 公式、表格與 Mermaid
- 🪾 訊息分支
- 🔍 搜尋能力（Exa、Tavily、智譜、LinkUp、Brave、Perplexity 等）
- 🧩 提示詞變數（模型名、時間等）
- 🤳 供應商 QR Code 匯入匯出
- 🧠 類 ChatGPT 的記憶功能
- 📝 AI 翻譯
- 🌐 自訂 HTTP 請求標頭與內容
- 💌 Silly Tavern 角色卡匯入

## 🚀 建置

環境需求：

- Android Studio（或 Android SDK 命令列工具）
- JDK 17 以上
- Android SDK：platform 37、build-tools 36

本分支已移除上游的 Firebase 整合，**無需 `google-services.json` 即可建置**。

在專案根目錄建立 `local.properties`，指向你的 SDK：

```properties
sdk.dir=/path/to/AndroidSDK
```

接著建置：

```bash
./gradlew :app:assembleDebug
```

產物位於 `app/build/outputs/apk/debug/`。

## 📄 授權條款

本專案以 [GNU Affero 通用公共授權條款第三版](LICENSE)（AGPL-3.0）授權。

原始碼倉庫：<https://github.com/ChuxueTeam/Weishu>

## 🙏 致謝與來源

Weishu 是 [RikkaHub](https://github.com/rikkahub/rikkahub) 的修改版分支，上游同樣以
AGPL-3.0 授權。原始著作權聲明予以保留，改動清單見 [NOTICE](NOTICE)。

本分支為獨立衍生作品，與 RikkaHub 專案無隸屬關係，未獲其背書或支援，亦不主張對
"RikkaHub" 名稱或標誌的任何權利。
