package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BootcampApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component
class Bar {
    private Foo foo;

    public Bar() {
        System.out.println(foo);
        System.out.println("created without foo");
    }

    public Bar(Foo foo) {
        this.foo = foo;
        System.out.println("created with foo");
    }
}

@Component
class Foo {
    public Foo() {
        System.out.println("created Foo");
    }
}