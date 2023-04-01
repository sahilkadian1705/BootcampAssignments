package com.sahilkadian.H2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String printMessage(){
        return "Welcome to SpringBoot";
    }
}
