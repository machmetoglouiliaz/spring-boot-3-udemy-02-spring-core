package com.mourat.udemy.springcoredemo.rest;

import com.mourat.udemy.springcoredemo.common.BaseballCoach;
import com.mourat.udemy.springcoredemo.common.Coach;
import com.mourat.udemy.springcoredemo.common.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //A private field for the dependency
    private Coach myCoach;

    //A setter for dependency injection
    @Autowired
    public void setCoach(BaseballCoach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
