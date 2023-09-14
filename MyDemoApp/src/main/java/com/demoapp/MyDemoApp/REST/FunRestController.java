package com.demoapp.MyDemoApp.REST;

import com.demoapp.MyDemoApp.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public FunRestController(
            @Qualifier("tennisCoach") Coach theCoach,
            @Qualifier("tennisCoach") Coach theAnotherCoach){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : " + (myCoach == anotherCoach);
    }
}
