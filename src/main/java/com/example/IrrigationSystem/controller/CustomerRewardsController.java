package com.example.IrrigationSystem.controller;

import com.example.IrrigationSystem.service.CustomRewardsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRewardsController {

    private Logger logger = LoggerFactory.getLogger(CustomerRewardsController.class);

    @Autowired
    CustomRewardsService rewardsService;

    @RequestMapping("/getRewards/{amount}")
    public ResponseEntity<Integer> getRewardsPoints(@PathVariable("amount") int amount) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(rewardsService.calculateRewards(amount));
        } catch (Exception e) {
            logger.error("Exception Caught in CustomRewardsController.getRewardsPoints()  " + e);
            return (ResponseEntity<Integer>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
