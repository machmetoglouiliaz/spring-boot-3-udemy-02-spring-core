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

    // Two private fields for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkBeans(){
        return "Is coach and another coach same?: " + (myCoach == anotherCoach);
    }
}
