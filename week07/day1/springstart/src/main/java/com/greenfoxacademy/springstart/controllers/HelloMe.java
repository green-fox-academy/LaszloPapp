package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloMe {

    @RequestMapping(value = "/greetingMe")
    public Greeting myname(@RequestParam("name")String name){
        Greeting greeting = new Greeting(1, "Hello" ,name);
        return greeting;
    }
}
