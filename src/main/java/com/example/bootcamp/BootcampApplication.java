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
    String dummyBean(@Value("#{uuid.getUuid()}") String uuid) {
        System.out.println(uuid);
        return "Hello";
    }

    @Bean
    String dummyBean2(@Value("#{uuid.getUuid()}") String uuid) {
        System.out.println(uuid);
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }
}

@Component("uuid")
class UuidService {
    private final String uuid;

    public UuidService() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }
}
