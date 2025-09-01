package com.tpre814.example.api_stock.controller;

import com.tpre814.example.api_stock.entity.Stock;
import com.tpre814.example.api_stock.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mouvements")
public class StockController {

    private final StockService service;

    public StockController(StockService service) {
        this.service = service;
    }

    @GetMapping
    public List<Stock> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Stock create(@RequestBody Stock mouvement) {
        return service.save(mouvement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
