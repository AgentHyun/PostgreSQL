package com.example.fruitdemo.controller;

import com.example.fruitdemo.model.Fruit;
import com.example.fruitdemo.service.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @PostMapping
    public void insertFruit(@RequestBody Fruit fruit) {
        fruitService.addFruit(fruit);
    }
}
