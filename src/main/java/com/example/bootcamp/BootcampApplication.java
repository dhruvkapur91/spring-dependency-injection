package com.example.bootcamp;

import org.springframework.beans.factory.annotation.Value;
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

interface KeyValueWriter {
    public void write(String key, String value);
}

@Component("test")
class TestWriter implements KeyValueWriter {

    public TestWriter() {
        System.out.println("Initialized test writer");
    }

    @Override
    public void write(String key, String value) {
        System.out.println("Using the test implementation");
    }
}

@Component("prod")
class ProdWriter implements KeyValueWriter {

    public ProdWriter() {
        System.out.println("Initialized prod writer");
    }

    @Override
    public void write(String key, String value) {
        System.out.println("Using the production implementation");
    }
}
