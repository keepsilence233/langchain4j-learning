package com.example;

import dev.langchain4j.model.openai.OpenAiChatModel;

public class Models {

    public static OpenAiChatModel chatModel() {
        String apiKey = System.getenv("OPENAI_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            return OpenAiChatModel.builder()
                    .baseUrl("http://langchain4j.dev/demo/openai/v1")
                    .apiKey("demo")
                    .modelName("gpt-4o-mini")
                    .build();
        }
        // 兼容 OpenAI 协议的服务（如 DeepSeek）可通过 OPENAI_BASE_URL / OPENAI_MODEL 配置
        String baseUrl = System.getenv("OPENAI_BASE_URL");
        String modelName = System.getenv("OPENAI_MODEL");
        return OpenAiChatModel.builder()
                .baseUrl(baseUrl == null || baseUrl.isBlank() ? "https://api.openai.com/v1" : baseUrl)
                .apiKey(apiKey)
                .modelName(modelName == null || modelName.isBlank() ? "gpt-4o-mini" : modelName)
                .build();
    }
}
