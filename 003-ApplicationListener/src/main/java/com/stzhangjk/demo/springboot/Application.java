package com.stzhangjk.demo.springboot;

import com.stzhangjk.demo.springboot.listener.ApplicationEnvironmentPreparedListener;
import com.stzhangjk.demo.springboot.listener.ApplicationFailedListener;
import com.stzhangjk.demo.springboot.listener.ApplicationPreparedListener;
import com.stzhangjk.demo.springboot.listener.ApplicationStartedListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhjk on 2017/4/10.
 */
@SpringBootApplication//等价于使用@Configuration+@EnableAutoConfiguration+@ComponentScan
public class Application {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new ApplicationStartedListener());
        application.addListeners(new ApplicationEnvironmentPreparedListener());
        application.addListeners(new ApplicationPreparedListener());
        application.addListeners(new ApplicationFailedListener());
        application.run(args);
    }
}
