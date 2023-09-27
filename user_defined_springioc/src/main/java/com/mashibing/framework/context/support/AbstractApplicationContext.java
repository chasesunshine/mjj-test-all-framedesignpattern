package com.mashibing.framework.context.support;

import com.mashibing.framework.beans.factory.support.BeanDefinitionReader;
import com.mashibing.framework.beans.factory.support.BeanDefinitionRegistry;
import com.mashibing.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 作为ApplicationContext接口的子类，所以该类也是非延时加载，所以需要在该类中定义一个Map集合，
 * 作为bean对象存储的容器。
 * 声明BeanDefinitionReader类型的变量，用来进行xml配置文件的解析，符合单一职责原则。
 * BeanDefinitionReader类型的对象创建交由子类实现，因为只有子类明确到底创建BeanDefinitionReader
 * 哪儿个子实现类对象。
 *
 * ApplicationContext接口的子类实现类
 *         创建容器对象时,加载配置文件,对bean进行初始化
 * @author spikeCong
 * @date 2022/10/28
 **/
public abstract class AbstractApplicationContext implements ApplicationContext {

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义一个存储bean对象的Map集合
    protected Map<String,Object> singletonObjects = new HashMap<>();

    //声明一个配置文件路径变量
    protected String configLocation;

    @Override
    public void refresh() {

        //加载BeanDefinition对象
        try {
            beanDefinitionReader.loadBeanDefinitions(configLocation);

            //初始化
            finishInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //bean初始化
    protected void finishInitialization() throws Exception {
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        //获取BeanDefinition对象
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            getBean(definitionName);
        }
    };
}
