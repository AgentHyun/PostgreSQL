package com.example.fruitdemo.mapper;

import com.example.fruitdemo.model.Fruit;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface FruitMapper {
    @Select("SELECT * FROM fruit")
    List<Fruit> findAll();

    @Insert("INSERT INTO fruit(name, count) VALUES(#{name}, #{count})")
    void insertFruit(Fruit fruit);
}
