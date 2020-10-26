package com.example.bootcamp;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
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

    private final Log log = LogFactory.getLog(getClass());

    public Bar(@Value("#{uuid.getUuid()}") String uuid, @Value("#{1 > 2}") boolean someBooleanCondition) {
        log.info("UUID Is");
        log.info(uuid);
        log.info("And the boolean condition is " + someBooleanCondition);
    }
}