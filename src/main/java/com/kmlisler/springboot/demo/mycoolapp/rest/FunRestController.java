package com.kmlisler.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
@RestController
public class FunRestController {


    // expose "/" that return "whatever i want"
    @GetMapping("/")
    public String sayHello(){
        return "its just beginning : Time on server is :" + LocalDateTime.now();
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run run run ";
    }
}
