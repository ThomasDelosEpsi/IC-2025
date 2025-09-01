package com.tpre814.example.api_stock.repository;

import com.tpre814.example.api_stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
