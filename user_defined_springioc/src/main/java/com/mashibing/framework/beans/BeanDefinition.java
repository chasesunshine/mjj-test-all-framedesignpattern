package com.mashibing.framework.beans;

import lombok.Data;

/**
 * 封装bean标签数据的类
 * 包括id和class以及bean的子标签property
 *
 * @author spikeCong
 * @date 2022/10/27
 **/
@Data
public class BeanDefinition {

    private String id;

    private String className;

    // 该类用来存储和遍历多个PropertyValue对象
    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    @Override
    public String toString() {
        return "BeanDefinition{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", propertyValues=" + propertyValues +
                '}';
    }
}
