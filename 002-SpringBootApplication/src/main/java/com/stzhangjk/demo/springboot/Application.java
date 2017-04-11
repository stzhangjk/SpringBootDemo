package com.stzhangjk.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhjk on 2017/4/10.
 */
@SpringBootApplication//等价于使用@Configuration+@EnableAutoConfiguration+@ComponentScan
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
