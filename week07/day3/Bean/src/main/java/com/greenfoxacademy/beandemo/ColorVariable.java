package com.greenfoxacademy.beandemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorVariable {

    @Bean
    public MyColor redColor(){
        return new RedColor();
    }
}
