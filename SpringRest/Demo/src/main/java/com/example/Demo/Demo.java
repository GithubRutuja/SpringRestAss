package com.example.Demo;

import com.example.Demo.Bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class Demo implements CommandLineRunner {
    @Autowired
    private ProductRepository repository;
    public static void main(String[] args) {
        ConfigurableApplicationContext ct = SpringApplication.run(Demo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Product(1,"mixer",1, 2499.00F));
        System.out.println("Product Running......");
    }
}
