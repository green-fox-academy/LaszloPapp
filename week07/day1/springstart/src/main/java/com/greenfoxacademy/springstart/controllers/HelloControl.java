package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

    @RequestMapping(value="/hello")
    public String hello(){
        return "Hello World";
    }
}


