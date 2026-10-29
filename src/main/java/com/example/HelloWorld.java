package com.example;

import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * 快速开始：直接调用 OpenAiChatModel。
 * 设置了环境变量 OPENAI_API_KEY 就用自己的密钥，否则使用官方 demo 代理（仅限 gpt-4o-mini，有配额）。
 */
public class HelloWorld {

    public static void main(String[] args) {
        OpenAiChatModel model = Models.chatModel();
        String answer = model.chat("Say 'Hello World'");
        System.out.println(answer);
    }
}
