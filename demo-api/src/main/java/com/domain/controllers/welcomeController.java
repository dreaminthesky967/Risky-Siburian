package com.domain.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/welcome")
public class welcomeController {
    


    @GetMapping
    public String welcome(){
        return "welcome to Spring Boot Rest API";    
    }
}
