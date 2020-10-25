package com.example.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component
class Bar {

    public Bar(Foo foo) {
        System.out.println("created bar");
    }
}

@Component
class FooUser2 {
    public FooUser2(Foo foo) {
        System.out.println("craeted foo user 2");
    }
}

@Component
class Foo {
    public Foo() {
        System.out.println("created Foo");
    }
}