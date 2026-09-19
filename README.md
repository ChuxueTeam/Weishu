<div align="center">
  <img src="docs/icon.png" alt="App Icon" width="100" />
  <h1>Weishu · 𣻷澍</h1>

原生 Android 多供应商 LLM 聊天客户端 🤖💬

> 「𣻷澍」这个名字来自一个人的名字。

[English](README_EN.md) | 简体中文 | [繁體中文](README_ZH_TW.md)
</div>

## ✨ 功能

- 🎨 Material You 设计，🌙 深色模式
- 🔄 多 AI 供应商：自带 API Key、地址与模型（兼容 OpenAI / Google / Anthropic 接口）
- 🖼️ 多模态输入（图片、文本文档、PDF、DOCX）
- 🌐 网页阅读：把网址交给模型，它会直接打开并读取页面内容，无需搜索服务
- 🛠️ MCP 支持
- 📝 Markdown 渲染，含代码高亮、LaTeX 公式、表格与 Mermaid
- 🪾 消息分支
- 🔍 搜索能力（Exa、Tavily、智谱、LinkUp、Brave、Perplexity 等）
- 🧩 提示词变量（模型名、时间等）
- 🤳 供应商二维码导入导出
- 🧠 类 ChatGPT 的记忆功能
- 📝 AI 翻译
- 🌐 自定义 HTTP 请求头与请求体
- 💌 Silly Tavern 角色卡导入

## 🚀 构建

环境要求：

- Android Studio（或 Android SDK 命令行工具）
- JDK 17 及以上
- Android SDK：platform 37、build-tools 36

本 fork 已移除上游的 Firebase 集成，**无需 `google-services.json` 即可构建**。

在仓库根目录创建 `local.properties`，指向你的 SDK：

```properties
sdk.dir=/path/to/AndroidSDK
```

然后构建：

```bash
# Linux / macOS
./gradlew :app:assembleDebug

# Windows
gradlew.bat :app:assembleDebug
```

产物位于 `app/build/outputs/apk/debug/`。

## 🧱 模块结构

| 模块 | 职责 |
|---|---|
| `app` | Android 应用主体、界面与装配 |
| `ai` | 供应商抽象（OpenAI / Google / Anthropic）与流式处理 |
| `search` | 联网搜索服务集成 |
| `speech` | 语音合成 / 识别 |
| `document` | 文档解析 |
| `highlight` | 代码高亮 |
| `material3` | Material 3 主题辅助 |
| `workspace` | 基于 proot 的 Linux 工作区 |
| `oauth` | OAuth 回环回调辅助 |
| `videogen` | 视频生成 |
| `web`、`web-ui` | 本地 Web UI 资源 |
| `common` | 公共工具 |

## 📄 许可协议

本项目采用 [GNU Affero 通用公共许可证第三版](LICENSE)（AGPL-3.0）授权。

源码仓库：<https://github.com/ChuxueTeam/Weishu>

## 🙏 致谢与来源

Weishu 是 [RikkaHub](https://github.com/rikkahub/rikkahub) 的修改版分支，上游同样以
AGPL-3.0 授权。原始版权声明予以保留，改动清单见 [NOTICE](NOTICE)。

本分支为独立衍生作品，与 RikkaHub 项目无从属关系，未获其背书或支持，也不主张对
"RikkaHub" 名称或标志的任何权利。
