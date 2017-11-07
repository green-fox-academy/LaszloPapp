package com.greenfoxacademy.restfirst.controller;
import com.greenfoxacademy.restfirst.model.DoubleObject;
import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.model.Greeter;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RequestController {


    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Object doublingProvider(@RequestParam(required = false) Integer input){
        Error errorDoub = new Error("Please provide an input!");
        System.out.println(input);

        if(input == null){
            return errorDoub;
        }else {
            DoubleObject doub = new DoubleObject(input);
            return doub;
        }
    }

    @RequestMapping(value = "/greeter", method = RequestMethod.GET)
    public Object greeter(@RequestParam(required = false,value = "name")String name ,@RequestParam(required = false,value = "title") String title){
        Greeter petya = new Greeter(name,title);
        Error errorName = new Error("Please provide a name!");
        Error errorTitle = new Error("Please provide a title!");

       if(null == name){
            return errorName;
        }else if(null == title) {
            return errorTitle;
        }else {
            return petya;
        }
    }
}
