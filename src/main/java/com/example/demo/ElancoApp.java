package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ElancoApp {
    // Entry point for the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(ElancoApp.class, args);
    }
}
