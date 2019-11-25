package com.source.learn.springApplication_lifecycleCallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * 测试spring生命周期的回调
 * 添加了@lazy，调用的时候才会初始化这个类，默认lazy是true
 *
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
@Repository
/*@Lazy*/
public class IndexDaoImpl implements IndexDao, InitializingBean, DisposableBean {

	public IndexDaoImpl() {
		System.out.println("IndexDaoImpl # constructor...");
	}

	/**constructor
	 * 实现InitializingBean接口后的重写方法
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IndexDaoImpl # init...");
	}

	/**
	 * 实现DisposableBean接口后的重写方法
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("IndexDaoImpl # destroy...");
	}


	@Override
	public void test() {
		System.out.println("IndexDaoImpl # test...");
	}
}
