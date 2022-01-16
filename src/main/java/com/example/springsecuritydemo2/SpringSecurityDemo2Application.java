package com.example.springsecuritydemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)//dzięki temu adnotacje Secured działają -> @Secured("ROLE_ADMIN")
                                                                         //logujemy się jako user i wpisujemy jak admin i dostajemy -> 403 Forbidden
public class SpringSecurityDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemo2Application.class, args);
    }
}