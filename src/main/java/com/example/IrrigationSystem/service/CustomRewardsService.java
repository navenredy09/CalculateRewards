package com.example.IrrigationSystem.service;

import org.springframework.stereotype.Service;

@Service
public class CustomRewardsService implements CustomerRewardsInterface {

    @Override
    public int calculateRewards(int input) {
        int points =0;
        if (input>100 ) {
            points = (input-100) *2;
            points = points+50;
        } else if (input >50) {
            points = 50;
        }
        return points;
    }
}
