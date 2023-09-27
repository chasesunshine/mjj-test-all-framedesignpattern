package com.mashibing.spring02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件源 . 事件的发布
 */
@Component
public class Request {

    @Autowired
    private ApplicationContext applicationContext;

    public void doRequest(){
        System.out.println("调用Request类中的doRequest方法,发送一个请求......");
        applicationContext.publishEvent(new RequestEvent(this));
    }
}
