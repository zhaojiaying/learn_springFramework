package com.source.learn;

import com.source.learn.aop_aspectJSupport.AopTestBean;
import com.source.learn.aop_aspectJSupport.AopTestBeanImp;
import com.source.learn.aop_aspectJSupport.TestMethod;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 学习spring AOP 入口程序
 *
 * @author: jiayingzhao
 * @Date: 2019.11.10
 */
public class AopMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);
		ac.getBean(TestMethod.class).method();
		System.out.println("--------------------------------------------------------------------");
		AopTestBean bean = (AopTestBean) ac.getBean("aopTestBeanImp");
		System.out.println(bean instanceof AopTestBeanImp); //返回的是false，加了aop后，是代理对象了 $Proxy...
		bean.query();
	}

}

