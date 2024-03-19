package com.demo.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.demo-microservices", "com.demo.general"})
@SpringBootApplication
public class MicroGeneralServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGeneralServiceApplication.class, args);
    }

}