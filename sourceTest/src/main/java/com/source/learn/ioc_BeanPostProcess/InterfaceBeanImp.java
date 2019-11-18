package com.source.learn.ioc_BeanPostProcess;

import org.springframework.stereotype.Component;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.09
 */
@Component("interfaceBeanImp")
public class InterfaceBeanImp implements InterfaceBean {

	public InterfaceBeanImp() {
		System.out.println("InterfaceAopTestImp构造方法...");
	}

	@Override
	public void query() {
		System.out.println("执行query方法");
	}

	@Override
	public void read() {
		System.out.println("执行read方法");
	}
}
