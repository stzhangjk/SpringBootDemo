package com.stzhangjk.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhjk on 2017/4/10.
 */
@RestController
public class HelloWorldController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(name);
        return "001 hello world !";
    }
}
