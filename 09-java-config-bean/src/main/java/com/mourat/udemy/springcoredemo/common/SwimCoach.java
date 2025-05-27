package com.mourat.udemy.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice butterfly swimming for 45 minutes!";
    }
}

