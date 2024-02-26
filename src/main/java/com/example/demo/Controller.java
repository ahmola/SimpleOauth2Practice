package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static int helloNumber = 0;

    @GetMapping("/home")
    public String home(){
        helloNumber++;
        return "Hello " + helloNumber;
    }
}
