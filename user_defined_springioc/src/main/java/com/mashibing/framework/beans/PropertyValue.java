package com.mashibing.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 该类用来封装Bean标签下的property子标签属性
 *      1.name属性
 *      2.ref属性
 *      3.value属性: 给基本数据类型或者String类型数据赋值的值
 * @author spikeCong
 * @date 2022/10/27
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyValue {

    private String name;

    private String ref;

    private String value;

    @Override
    public String toString() {
        return "PropertyValue{" +
                "name='" + name + '\'' +
                ", ref='" + ref + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
