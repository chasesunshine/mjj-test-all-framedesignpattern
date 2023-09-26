package com.mashibing.spring01.demo01.beanfactory;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author spikeCong
 * @date 2022/10/25
 **/
@Data
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private Friends friends;

    public User(Friends friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}
