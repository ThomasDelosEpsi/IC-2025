package com.tpre814.example.api_stock.service;

import com.tpre814.example.api_stock.entity.Stock;
import com.tpre814.example.api_stock.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    
    private final StockRepository repository;

    public StockService(StockRepository repository) {
        this.repository = repository;
    }

    public List<Stock> findAll() {
        return repository.findAll();
    }

    public Stock save(Stock mouvement) {
        return repository.save(mouvement);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
