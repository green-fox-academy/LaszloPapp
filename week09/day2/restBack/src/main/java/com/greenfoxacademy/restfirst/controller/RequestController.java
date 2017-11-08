package com.greenfoxacademy.restfirst.controller;
import com.greenfoxacademy.restfirst.model.*;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RequestController {

    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Object doublingProvider(@RequestParam(value = "input" ,required = false) Integer input){

        if(input == null){
            return new Error("Please provide an input!");
        }else {
            return new DoubleObject(input);
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

    @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
    public Object append(@PathVariable String appendable){
        Map<String,String> appenda = new HashMap();
        appenda.put("appended",appendable + "a");
        return appenda;
    }

    @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
    public Object dountil(@PathVariable ("what") String what, @RequestBody Until until){
        if(until == null){
            return new Error("Please provide a number!");
        }else{
            return new Dountil(what,until.getUntil());
        }
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Error doError(){
        return new Error("Please provide a number!");
    }


}
