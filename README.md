# langchain4j-learning

LangChain4j 学习项目，依赖配置参考 [快速开始](https://langchain4j.cn/get-started/)。

## 环境

- JDK 17+
- Maven 3.x
- LangChain4j 1.3.0（通过 `langchain4j-bom` 管理版本）

## 依赖

- `langchain4j-open-ai`：OpenAI 集成
- `langchain4j`：高级 AI 服务 API（`AiServices`）

## API 密钥

建议放在环境变量里：

```bash
export OPENAI_API_KEY=sk-...
```

使用 DeepSeek 等兼容 OpenAI 协议的服务时，再加上地址和模型名：

```bash
export OPENAI_BASE_URL=https://api.deepseek.com/v1
export OPENAI_API_KEY=sk-...
export OPENAI_MODEL=deepseek-chat
```

不设置 `OPENAI_API_KEY` 时自动使用官方 demo 密钥（请求经 langchain4j.dev 代理，仅限 `gpt-4o-mini`，有配额，仅供演示）。

## 示例

| 类 | 内容 |
| --- | --- |
| `HelloWorld` | 直接调用 `OpenAiChatModel` |
| `AiServiceExample` | 用接口 + `AiServices` 声明一个助手 |

```bash
mvn compile exec:java -Dexec.mainClass=com.example.HelloWorld
```
