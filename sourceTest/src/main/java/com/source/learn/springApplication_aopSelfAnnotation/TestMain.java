package com.source.learn.springApplication_aopSelfAnnotation;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
public class TestMain {

	public static void main(String[] args) {
		CityEntity cityEntity = new CityEntity();
		cityEntity.setId("1");
		cityEntity.setName("one");
		String sql = CommonUtil.buildQuerySqlForEntity(cityEntity);
		System.out.println(sql);
	}

}
