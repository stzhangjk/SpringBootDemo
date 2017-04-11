package com.stzhangjk.demo.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhjk on 2017/4/10.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "001 hello world !";
    }
}
