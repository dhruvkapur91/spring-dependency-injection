package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
public class BootcampApplication {

    @Bean
    Bar bar(Foo foo, UuidService uuidService) {
        return new Bar(foo, uuidService.buildUuid());
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component("uuid")
class UuidService {
    public String buildUuid() {
        return UUID.randomUUID().toString();
    }
}

class Bar {
    public Bar(Foo foo, String uuid) {
        System.out.println(uuid);
        System.out.println("created bar");
    }
}

@Component
class Foo {
    public Foo() {
        System.out.println("created Foo");
    }
}