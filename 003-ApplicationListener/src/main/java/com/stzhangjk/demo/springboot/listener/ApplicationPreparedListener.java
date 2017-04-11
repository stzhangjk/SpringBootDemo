package com.stzhangjk.demo.springboot.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhjk on 2017/4/11.
 */
public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("==========ApplicationPrepared==========");
    }
}
