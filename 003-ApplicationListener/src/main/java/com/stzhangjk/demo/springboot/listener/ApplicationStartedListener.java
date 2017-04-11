package com.stzhangjk.demo.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhjk on 2017/4/11.
 */
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("==========ApplicationStarted==========");
    }
}
