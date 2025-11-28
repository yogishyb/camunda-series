package com.aplish.camunda;


import org.springframework.scheduling.annotation.EnableScheduling;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableScheduling
public class PredictiveQualityControlApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(PredictiveQualityControlApplication.class, args);
    }
}