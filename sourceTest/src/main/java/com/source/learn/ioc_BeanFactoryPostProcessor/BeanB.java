package com.source.learn.ioc_BeanFactoryPostProcessor;

import javax.annotation.PostConstruct;

/**
 * 没有加spring的component注解，但是通过myBeanFactoryPostProcessor，将原本注入的BeanA类替换为BeanB
 * @author: jiayingzhao
 * @Date: 2019.10.28
 */
public class BeanB {

	//添加注解@PostConstructs在构造方法之后执行此方法
	@PostConstruct
	public void aa(){
		System.out.println("PostConstruct...");
	}

	public BeanB() {
		System.out.println("BeanB用于断点查看什么时候spring把bean加载完...");
	}
}
