package com.source.learn.springApplication_xmldependencyInjetion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过xml配置文件进行IOC容器管理
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
public class IocXmlMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*测试set方法注入*/
		BClassService bClassService = (BClassService) ac.getBean("bClassService");
		/*测试构造方法注入*/
		CClassService cClassService = (CClassService) ac.getBean("cClassService");
		bClassService.service();
		cClassService.service();
	}

}
