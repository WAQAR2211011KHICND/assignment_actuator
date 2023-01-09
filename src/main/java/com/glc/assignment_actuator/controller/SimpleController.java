package com.glc.assignment_actuator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  http://localhost:8080
public class SimpleController {
    
    @GetMapping("/checking")
    public String checking(){
        String data = "I am Runing";
        return data;
    }

}
