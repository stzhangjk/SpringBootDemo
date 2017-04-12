package com.stzhangjk.demo.springboot.controller;

import com.stzhangjk.demo.springboot.config.DataBaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhjk on 2017/4/12.
 */
@RestController
public class TestController {
    @Autowired
    private DataBaseConfiguration dbConfig;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(dbConfig.getHost());
        System.out.println(dbConfig.getCharset());
        System.out.println(dbConfig.getDatabase());
        System.out.println(dbConfig.getUsername());
        System.out.println(dbConfig.getPassword());
        return "hello";
    }
}
