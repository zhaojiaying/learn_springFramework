package com.source.learn.springApplication_lifecycleCallback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.23
 */
@Service
public class IndexService {

	@Autowired
	//todo @Qualifier("indexDaoImpl2")注解不管用 ?????
	IndexDao dao;


	public IndexService() {
		System.out.println("IndexService # constructor...");
	}
}
