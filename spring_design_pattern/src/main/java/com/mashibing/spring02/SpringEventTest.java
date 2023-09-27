package com.mashibing.spring02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.mashibing.spring02");
        Request request = (Request) context.getBean("request");

        // 调用方法,发布事件
        request.doRequest();
    }
}
