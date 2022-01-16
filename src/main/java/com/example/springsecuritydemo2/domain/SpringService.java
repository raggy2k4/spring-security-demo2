package com.example.springsecuritydemo2.domain;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SpringService {

    public String all(){
        return "all";
    }

    @Secured("ROLE_ADMIN")
    public String admin(){
        return "admin";
    }

    @Secured("ROLE_USER")
    public String user(){
        return "user";
    }
}
