package com.example.springsecuritydemo2.controller;


import com.example.springsecuritydemo2.domain.SpringService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MyController {

    private SpringService springService;

    @GetMapping("/all")
    public String allEndpoint(){
        return springService.all();
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return springService.admin();
    }

    @GetMapping("/user")
    public String userEndpoint(){
        return springService.user();
    }

}
