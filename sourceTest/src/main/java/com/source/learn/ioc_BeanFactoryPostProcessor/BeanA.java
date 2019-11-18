package com.source.learn.ioc_BeanFactoryPostProcessor;

import org.springframework.stereotype.Component;

/**
 * 添加了componenet注解，并在AppConfig中说明了spring扫描的包，按理是应该注入容器的
 * 但是在myBeanFactoryPostProcessor中对名字为beanA的BeanDefination进行了类属性的替换，替换成了BeanB类
 *
 * @author: jiayingzhao
 * @Date: 2019.10.26
 */
@Component("beanA")
public class BeanA {
}
