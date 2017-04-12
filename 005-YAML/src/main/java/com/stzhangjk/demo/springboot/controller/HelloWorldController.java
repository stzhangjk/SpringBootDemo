package com.stzhangjk.demo.springboot.controller;

import com.stzhangjk.demo.springboot.config.ConnectionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhjk on 2017/4/10.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private ConnectionConfig connConfig;
    @Value("${sample}")
    private String sample;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(connConfig.getUsername());
        System.out.println(connConfig.getPassword());
        System.out.println(connConfig.getRemoteAddr());
        System.out.println(sample);

        connConfig.getList().forEach((e)->{
            System.out.println(e);
        });

        int[] array = connConfig.getArray();
        for(int i : array){
            System.out.println(i);
        }

        connConfig.getListmap().forEach((e)->{
            e.forEach((k,v)->{
                System.out.println(k+":"+v);
            });
        });

        System.out.println(connConfig.getStr());

        return "001 hello world !";
    }
}
