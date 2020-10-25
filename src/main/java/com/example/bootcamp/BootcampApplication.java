package com.example.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    Bar bar(Foo foo) {
        return new Bar(foo);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
        System.out.println("created bar");
    }
}

@Component
class Foo {
    public Foo() {
        System.out.println("created Foo");
    }
}