package com.demoapp.MyDemoApp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "run 20 rounds";
    }
}
