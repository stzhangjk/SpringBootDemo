package com.stzhangjk.demo.springboot.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhjk on 2017/4/11.
 */
public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println("==========ApplicationFailed==========");
    }
}
