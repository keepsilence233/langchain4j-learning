package com.example;

import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.SystemMessage;

/**
 * 高级 AI 服务 API（需要 langchain4j 依赖）：用接口声明能力，由 AiServices 生成实现。
 */
public class AiServiceExample {

    interface Assistant {
        @SystemMessage("你是一个乐于助人的助手，请用中文简洁回答。")
        String chat(String userMessage);
    }

    public static void main(String[] args) {
        Assistant assistant = AiServices.create(Assistant.class, Models.chatModel());
        System.out.println(assistant.chat("用一句话介绍 LangChain4j"));
    }
}
