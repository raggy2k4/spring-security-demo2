package com.example.springsecuritydemo2.domain;

import org.springframework.stereotype.Service;

@Service
public class SpringService {

    public String all(){
        return "all";
    }

    public String admin(){
        return "admin";
    }

    public String user(){
        return "user";
    }
}
