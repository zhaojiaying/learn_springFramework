package com.source.learn.springApplication_aopSelfAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于关联实体与数据库中的表
 * @Target 用于指定自定义注解使用在什么地方，Type是类， Field是属性上
 *
 * 注解的生命周期 @Retention(RetentionPolicy.SOURCE)
 * 		默认： SOURCE只在源码中，编译之后，原先加该注解的类上的注解都会消失
 * 			  CLASS只在class文件中，运行的时候就没了
 * 			  RUNTIME 运行后失效
 *
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SelfTable {

	//方法后面跟上default "" 那么加@SelfTarget的时候就可以不写value值
	public String value() default "";

	public String name() default "";

}
