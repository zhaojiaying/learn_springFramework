package com.source.learn.springApplication_xmldependencyInjetion;

/**
 * 测试 构造方法 注入
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
public class CClassService {

	ClassDao dao;

	public CClassService() {
	}

	/**
	 * 在xml中配置此依赖的时候，通过构造方法注入IOC容器，xml中使用constructor-arg注入
	 */
	public CClassService(ClassDao dao) {
		this.dao = dao;
	}

	public void service(){
		dao.service();
	}
}
