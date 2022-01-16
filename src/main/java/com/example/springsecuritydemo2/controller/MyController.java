package com.example.springsecuritydemo2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/all")
    public String allEndpoint(){
        return "all";
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "admin";
    }

    @GetMapping("/user")
    public String userEndpoint(){
        return "user";
    }
}
