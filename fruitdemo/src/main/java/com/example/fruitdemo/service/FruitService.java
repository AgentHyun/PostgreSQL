package com.example.fruitdemo.service;

import com.example.fruitdemo.mapper.FruitMapper;
import com.example.fruitdemo.model.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
    private final FruitMapper fruitMapper;

    public FruitService(FruitMapper fruitMapper) {
        this.fruitMapper = fruitMapper;
    }

    public List<Fruit> getAllFruits() {
        return fruitMapper.findAll();
    }

    public void addFruit(Fruit fruit) {
        fruitMapper.insertFruit(fruit);
    }
}
