package com.example.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    void dummyBean() {
        System.out.println("This got executed");
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}
