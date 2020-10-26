package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    void dummyBean(Foo foo) {
        System.out.println("This got executed");
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component
class Foo {
    public Foo() {
        System.out.println("Created foo");
    }
}
