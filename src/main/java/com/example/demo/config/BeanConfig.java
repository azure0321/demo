package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@Component
public class BeanConfig{
    public String bean1(){
        return "bean 3";
    }
}