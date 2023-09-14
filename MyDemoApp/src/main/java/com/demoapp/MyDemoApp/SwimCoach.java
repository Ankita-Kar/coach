package com.demoapp.MyDemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "run 30 rounds";
    }
}
