package com.example.IrrigationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CustomerRewardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRewardsApplication.class, args);
    }

}
