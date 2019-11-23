package com.source.learn.springApplication_lifecycleCallback;

import com.source.learn.IocConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
public class indexMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig.class);
		ac.getBean(IndexDao.class);
		/*System.out.println(ac.getBean(IndexService.class).getClass().getSimpleName());*/
	}

}
