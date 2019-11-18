package com.source.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 告诉spring扫描指定路径下面的包里的文件,ioc*是一ioc开头的包
 * @author: jiayingzhao
 * @Date: 2019.10.26
 */
@Configuration
@ComponentScan("com.source.learn.ioc*")
public class IocConfig {
}
