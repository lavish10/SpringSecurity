package com.spring.security.springsecuritydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResource {
    
    @GetMapping("/home")
    public String defaultRoute(){
        return "Hello";
    }
}
