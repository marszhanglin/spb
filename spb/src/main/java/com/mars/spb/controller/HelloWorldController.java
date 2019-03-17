package com.mars.spb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${com.mars.spb.version}")
    private String spbVersion;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World2,Version:"+spbVersion;
    }
}