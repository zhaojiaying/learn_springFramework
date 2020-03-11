package com.source.learn.springApplication_aopSelfAnnotation;

import java.lang.annotation.Annotation;

/**
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
public class CommonUtil {

	/**
	 * 通过一个对象构建一条查询语句
	 */
	public static String buildQuerySqlForEntity(CityEntity cityEntity){
		/**
		 * 1. 获得类的类对象
		 */
		Class clazz = cityEntity.getClass();

		/**
		 * 2. 判断是否加了@SelfTable这个注解（因为注解是类上的，所以获取类再判断）
		 */
		//ps：注解@SelfTable必须加上生命周期为RUNTIME,否则注解在运行的时候就无效
		System.out.println(clazz.isAnnotationPresent(SelfTable.class));
		if(clazz.isAnnotationPresent(SelfTable.class)){
			/**
			 * 3.得到注解
			 */
			SelfTable tableAnnotation = (SelfTable) clazz.getAnnotation(SelfTable.class);
			/**
			 * 4.调用获取到的注解的方法,相当于获取类上面注解括号里的值
			 */
			String tableValue = tableAnnotation.value();
			System.out.println(tableValue);
		}

		String sql = "";
		return sql;
	}

}
