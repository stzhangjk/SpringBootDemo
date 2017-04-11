package com.stzhangjk.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhjk on 2017/4/10.
 */
@Configuration//可以多个@Configuration Class
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)//只能1个
@ComponentScan//因为主启动类放在root，所以不需要添加任何参数
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
