package com.mashibing.framework.beans.factory.support;

/**
 * - BeanDefinitionReader用来解析配置文件并在注册表中
 *      注册bean的信息。定义了两个规范：
 *
 *   * 获取注册表的功能,让外界可以通过该对象获取注册表对象
 *   * 加载配置文件,并注册bean数据
 *
 * 该接口定义了配置文件解析的规则
 * @author spikeCong
 * @date 2022/10/28
 **/
public interface BeanDefinitionReader {

    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation)throws Exception;

}
