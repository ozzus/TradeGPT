package com.ozzus.TradeGPT.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "tradeText")
@NoArgsConstructor
@AllArgsConstructor
public class Trade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMessage")
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String response;
    private String question;
    private String time;

    public Trade(String question, String response) {
        this.question = question;
        this.response = response;
        this.time = LocalTime.now().toString();
    }

}