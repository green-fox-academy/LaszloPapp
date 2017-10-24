package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    Greeting greeting = new Greeting(1,"content");

    @RequestMapping(value = "/greeting")
    public Greeting greeting(){
        return greeting;
    }
}
