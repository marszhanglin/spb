package com.mars.spb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${com.mars.spb.version}")
    private String spbVersion;

    @RequestMapping("/hello")
    public String index() {
        //SpringBoot默认给我们使用的是info级别的
        //由低到高  trace<debug<info<warn<error
        logger.trace("com.mars.spb.controller:trace");
        logger.debug("com.mars.spb.controller:debug");
        logger.info("com.mars.spb.controller:info");
        logger.warn("com.mars.spb.controller:warn");
        logger.error("com.mars.spb.controller:error");
        return "Hello World2,Version:"+spbVersion;
    }
}