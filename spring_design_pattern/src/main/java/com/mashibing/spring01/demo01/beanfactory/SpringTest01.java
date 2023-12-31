package com.mashibing.spring01.demo01.beanfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author spikeCong
 * @date 2022/10/25
 **/
public class SpringTest01 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = context.getBean("user", User.class);
        user.setId(1001);
        user.setName("大远");

        List<String> names = user.getFriends().getNames();
        for (String name : names) {
            System.out.println(user.getName() + "的朋友包括: " + name);
        }
    }
}
