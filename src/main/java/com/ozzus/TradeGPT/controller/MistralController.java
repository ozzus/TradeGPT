package com.ozzus.TradeGPT.controller;

import com.ozzus.TradeGPT.model.Trade;
import com.ozzus.TradeGPT.repository.TradeRepository;
import com.ozzus.TradeGPT.service.MistralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MistralController {
    private final TradeRepository tradeRepository;
    private final MistralService mistralService;
    @Autowired
    public MistralController(MistralService mistralService, TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
        this.mistralService = mistralService;
    }

    @GetMapping(value = "/chat")
    public ResponseEntity<String> giveResponse(@RequestParam String q) {
        System.out.println(q);
        String response = mistralService.generateText(q);
        tradeRepository.save(new Trade(q,response));
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
}
