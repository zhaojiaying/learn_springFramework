package com.source.learn.ioc_BeanPostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * 实现一个 spring的BeanPostProcess后置处理器
 * 重写postProcessAfterInitialization方法，在初始化之后执行
 *
 * 通过jdk的代理类Proxy.newProxyInstance()，传入自己创建的Invocationhandler类
 * 在InterfaceAopTestInvocationHandler中重写了invoke方法
 *
 * @author: jiayingzhao
 * @Date: 2019.11.09
 */

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("aopTestImp")){
			Class<?> anInterface = bean.getClass().getInterfaces()[0];
			Class<?>[] interfaceArray = new Class[]{anInterface};
			//应用了动态代理，传入了三个参数ClassLoader，Class<?>[] interfaces,InvocationHandler
			Object o = Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(),interfaceArray,new MyInvocationHandler(bean));
			return o;
		}
		return bean;
	}
}
