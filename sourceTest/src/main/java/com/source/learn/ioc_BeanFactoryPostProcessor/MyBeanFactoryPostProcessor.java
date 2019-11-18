package com.source.learn.ioc_BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 通过自定义实现BeanFactoryPostProcessor，修改注入的bean
 *
 * @author: jiayingzhao
 * @Date: 2019.10.28
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//为什么不使用父类BeanDefinition，因为子类GenericBeanDefinition的Api更丰富一些
		GenericBeanDefinition c = (GenericBeanDefinition) beanFactory.getBeanDefinition("beanA"); //通过bean名字获取beanDifinitation
		/*System.out.println(c.getBeanClassName());*/
		c.setBeanClass(BeanB.class);
	}
}
