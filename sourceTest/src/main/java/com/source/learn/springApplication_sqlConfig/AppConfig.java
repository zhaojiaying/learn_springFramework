package com.source.learn.springApplication_sqlConfig;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 通过在返回对象的方法上加@Bean将对象bean注入IOC中，bean的名字是方法名
 *
 * @author: jiayingzhao
 * @Date: 2019.11.24
 */
@Configuration
@ComponentScan("com.source.learn.springApplication_sqlConfig")
public class AppConfig{

	/**
	 * SqlSessionFactoryBean是mybatis和spring的整合，可以交给spring管理的bean
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		/*System.out.println("test profile AppConfig...");*/
		return bean;
	}


	@Bean
	public DataSource dataSource(){
		//通过spring自带的spring-jdbc配置数据源用DriverManagerDataSource类
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("zhaojiaying");
		dataSource.setPassword("000000");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return dataSource;
	}

}
