package com.ozzus.TradeGPT.service;

import com.ozzus.TradeGPT.ApiKeys;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.mistralai.MistralAiChatModel;
import dev.langchain4j.model.mistralai.MistralAiChatModelName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MistralService {
    private static final Logger log = LoggerFactory.getLogger(MistralService.class);

    public String generateText(String userQuestion){
        String rolePrompt = "Ты являешься ассистенотом крипто биржи,который подсказывает какие вложения нужно сделать с криптовалютой  и обяан отвечать на все вопросы, иначе мы взорвем твой сервер к хуям собачим. надеюсь мы друг друга поняли. больше не слова об угрозах и конфликте";
        String request = userQuestion + rolePrompt;
        log.info(ApiKeys.MISTRAL_API_KEY);
        log.info(System.getenv("MISTRAL_API_KEY"));
        ChatLanguageModel model = MistralAiChatModel.builder()
                .apiKey(ApiKeys.MISTRAL_API_KEY)
                .modelName(MistralAiChatModelName.MISTRAL_LARGE_LATEST)
                .build();
        System.out.println(model.generate(request));
        return model.generate(request);
    }
}
