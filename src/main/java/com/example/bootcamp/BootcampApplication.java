package com.example.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    String useWriter(KeyValueWriter writer) {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

interface KeyValueWriter {
    public void write(String key, String value);
}

@Component
class TestWriter implements KeyValueWriter {

    @Override
    public void write(String key, String value) {
        System.out.println("Using the test implementation");
    }
}

@Component
class ProdWriter implements KeyValueWriter {

    @Override
    public void write(String key, String value) {
        System.out.println("Using the production implementation");
    }
}
