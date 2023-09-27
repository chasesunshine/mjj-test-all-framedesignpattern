package com.mashibing.framework.context;

import com.mashibing.framework.beans.factory.BeanFactory;

/**
 * 该接口的所有的子实现类对bean对象的创建都是非延时的，
 * 所以在该接口中定义 `refresh()` 方法，该方法主要完成以下两个功能：
 *
 *  加载配置文件。
 *  根据注册表中的BeanDefinition对象封装的数据进行bean对象的创建。
 *
 * 定义非延时加载功能
 * @author spikeCong
 * @date 2022/10/28
 **/
public interface ApplicationContext extends BeanFactory {

    //进行配置文件的加载,并进行对象的创建
    void refresh();
}
