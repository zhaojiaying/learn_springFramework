package com.source.learn.springApplication_lifecycleCallback;

import com.source.learn.IocConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
public class IndexMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig.class);
		ac.getBean(IndexDao.class);
		/**
		 * 测试在IocConfig中，扫描包时配置excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.*.IndexService")
		 * 过滤掉IndexService
		 */
		/*System.out.println(ac.getBean(IndexService.class).getClass().getSimpleName());*/

		/**
		 * 测试IndexService中自动装配IndexDao时，有两个子类IndexDaoImpl和IndexDaoImp2，会@Autowired哪一个，还是报错
		 */
		ac.getBean(IndexService.class);

	}

}
