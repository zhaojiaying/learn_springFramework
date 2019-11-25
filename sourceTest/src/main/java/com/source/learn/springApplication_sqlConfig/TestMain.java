package com.source.learn.springApplication_sqlConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		/*ac.getEnvironment().setActiveProfiles("dev");
		*//**
		 * IOC重新注册了新的bean，要refresh一下
		 *//*
		ac.register(ProfileTestDao.class);
		//因为在new ApplicationContext的时候已经注册好了，所以要refresh一下
		//ac.refresh();*/
	}

}
