package com.demoapp.MyDemoApp.config;

import com.demoapp.MyDemoApp.Coach;
import com.demoapp.MyDemoApp.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
