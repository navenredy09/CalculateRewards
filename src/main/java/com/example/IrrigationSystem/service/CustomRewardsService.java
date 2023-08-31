package com.example.IrrigationSystem.service;

import org.springframework.stereotype.Service;

@Service
public class CustomRewardsService implements CustomerRewardsInterface {

    @Override
    public int calculateRewards(int input) {
        int rewardPoints =0;
        if (input>=100 ) {
            rewardPoints = (input-100) *2;
            // Since its above 100, we need 50 points for 50-100 amount
            rewardPoints = rewardPoints+50;
        } else if (input >= 50) {
            rewardPoints = input-50;
        }
        return rewardPoints;
    }
}
