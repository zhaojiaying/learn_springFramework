package com.source.learn.springApplication_xmldependencyInjetion;

/**
 * 测试 set方法 注入
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
public class BClassService {

	ClassDao dao;

	public void service(){
		dao.service();
	}

	/**
	 * 在xml中配置此依赖的时候，通过set方法注入IOC容器，xml中使用property来注入
	 */
	public void setDao(ClassDao dao) {
		this.dao = dao;
	}

}
