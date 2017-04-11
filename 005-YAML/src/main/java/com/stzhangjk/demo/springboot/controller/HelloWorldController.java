package com.stzhangjk.demo.springboot.controller;

import com.stzhangjk.demo.springboot.config.ConnectionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhjk on 2017/4/10.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private ConnectionConfig connConfig;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(connConfig.getUsername());
        System.out.println(connConfig.getPassword());
        System.out.println(connConfig.getRemoteAddr());
        return "001 hello world !";
    }
}
