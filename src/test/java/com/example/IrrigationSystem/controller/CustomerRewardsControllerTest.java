package com.example.IrrigationSystem.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRewardsControllerTest {
    @Autowired
    CustomerRewardsController controller;
    @Test
    void getRewardsPoints() {
       // ResponseEntity<Integer> rewardPoints = controller.getRewardsPoints(300);
        assertEquals(controller.getRewardsPoints(300), 450);
    }
}