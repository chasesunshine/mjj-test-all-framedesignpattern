package com.mashibing.spring02;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件状态对象
 *
 */
public class RequestEvent extends ApplicationEvent {
    // 接收一个事件源
    public RequestEvent(Object source) {
        super(source);
    }
}
