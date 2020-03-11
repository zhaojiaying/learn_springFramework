package com.source.learn.springApplication_aopSelfAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 注解@SelfTable是自定义注解，功能类似JPA中的@Table，用于关联实体与数据库表
 *
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
@SelfTable("city")
public class CityEntity {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
