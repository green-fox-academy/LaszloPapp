package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloMe {

    AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value = "/greetingMe")
    public Greeting myname(@RequestParam("name")String name){

        Greeting greeting = new Greeting(counter.getAndIncrement(), "Hello" ,name);
        return greeting;
    }
}
