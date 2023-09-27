package com.mashibing.spring02;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RequestListener implements ApplicationListener<RequestEvent> {
    @Override
    public void onApplicationEvent(RequestEvent requestEvent) {
        System.out.println("监听到RequestEvent事件,执行方法......");
    }
}
