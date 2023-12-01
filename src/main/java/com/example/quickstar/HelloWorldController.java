package com.example.quickstar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final Coach myCoach;
    @Autowired
    public HelloWorldController(Coach theCoach)
    {
        myCoach = theCoach;
    }
    @GetMapping(path = "/workout")
    public String dailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
