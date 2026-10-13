package com.tiffinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tiffinservice")
public class TiffinservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                TiffinservicesApplication.class, args);
    }
}