package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    String environment(@Value("${environment}") String environment) {
        System.out.println(environment);
        return environment;
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}