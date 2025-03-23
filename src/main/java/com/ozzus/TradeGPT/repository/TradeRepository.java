package com.ozzus.TradeGPT.repository;

import com.ozzus.TradeGPT.model.Trade;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
}
