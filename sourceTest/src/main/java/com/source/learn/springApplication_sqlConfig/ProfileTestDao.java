package com.source.learn.springApplication_sqlConfig;

import org.springframework.stereotype.Component;

/**
 * todo 注解@Profile的使用有问题，再研究一下
 *
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
@Component
/*@Profile("dev")*/
public class ProfileTestDao {

	public ProfileTestDao() {
		System.out.println("ProfileTestDao # constructor...");
	}
}
