package com.stzhangjk.demo.springboot.controller;

import com.stzhangjk.demo.springboot.config.DataBaseConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhjk on 2017/4/12.
 */
@RestController
public class TestController {
    @Resource
    private DataBaseConfiguration dbConfig;

    @RequestMapping("/hello")
    public String hello(){
        return dbConfig.toString();
    }
}
