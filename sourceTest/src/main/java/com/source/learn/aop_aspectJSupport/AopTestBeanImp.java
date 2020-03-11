package com.source.learn.aop_aspectJSupport;

import org.springframework.stereotype.Component;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.09
 */
@Component("aopTestBeanImp")
public class AopTestBeanImp implements AopTestBean {

	public AopTestBeanImp() {
	}

	@Override
	public void query() {
		System.out.println("执行query方法...");
	}
}
