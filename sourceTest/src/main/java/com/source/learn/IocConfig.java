package com.source.learn;

import com.source.learn.springApplication_lifecycleCallback.IndexService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 * 告诉spring扫描指定路径下面的包里的文件,ioc*是一ioc开头的包
 * @ComponentScan 如果一个值不需要写value，传多个值需要都写上
 * excludeFilters排除一些过滤条件，不扫描指定的类或者包
 *
 * @ComponentScan(value = {"com.source.learn.ioc*","com.source.learn.*Callback"},
 * 		excludeFilters = @ComponentScan.Filter(Service.class)) 不扫描带有注解Service的类 默认过滤条件是注解类
 *		或者excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.*.IndexService")
 *  *
 *  * @author: jiayingzhao
 * @Date: 2019.10.26
 */
@Configuration
@ComponentScan(value = {"com.source.learn.ioc*","com.source.learn.*Callback"},
		excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.*.IndexService"))
public class IocConfig {
}
