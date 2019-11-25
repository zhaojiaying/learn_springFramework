package com.source.learn.springApplication_lifecycleCallback;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * 用于测试@Autowird（默认使用byType装配），遇到多个相同类，怎么进行自动装配
 *
 * 添加@Primary可以解决自动装配，遇到多个相同子类的问题, 优先加载这个类
 *
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
@Repository
/*@Lazy*/
@Primary
public class IndexDaoImpl2 implements IndexDao{

	public IndexDaoImpl2() {
		System.out.println("IndexDaoImp2 # constructor...");
	}

	@Override
	public void test() {
		System.out.println("IndexDaoImpl2 # test...");
	}
}
