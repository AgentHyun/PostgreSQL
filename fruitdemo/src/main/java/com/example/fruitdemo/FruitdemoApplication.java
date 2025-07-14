package com.example.fruitdemo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.fruitdemo.mapper")
public class FruitdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FruitdemoApplication.class, args);
    }
}
