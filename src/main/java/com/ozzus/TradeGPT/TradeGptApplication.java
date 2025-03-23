package com.ozzus.TradeGPT;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.mistralai.MistralAiChatModel;
import dev.langchain4j.model.mistralai.MistralAiChatModelName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeGptApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeGptApplication.class, args);
	}

}
