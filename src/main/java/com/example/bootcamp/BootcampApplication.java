package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component("uuid")
class UuidService {
    public String getUuid() {
        return UUID.randomUUID().toString();
    }
}

@Component
class Bar {
    public Bar(@Value("#{uuid.getUuid()}") String uuid) {
        System.out.println("Getting UUID directly");
        System.out.println(uuid);
    }
}