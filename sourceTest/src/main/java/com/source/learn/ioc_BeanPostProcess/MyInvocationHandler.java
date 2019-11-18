package com.source.learn.ioc_BeanPostProcess;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通过自定义的InvocationHandler，重写invoke方法
 *
 * @author: jiayingzhao
 * @Date: 2019.11.09
 */
public class MyInvocationHandler implements InvocationHandler {

	Object object;

	public MyInvocationHandler() {
	}

	public MyInvocationHandler(Object obj) {
		this.object = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理--before........");
		Object result = method.invoke(object);
		System.out.println("动态代理--after........");
		return result;
	}
}
