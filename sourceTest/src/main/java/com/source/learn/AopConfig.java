package com.source.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy 使用aspectJ support
 * @author: jiayingzhao
 * @Date: 2019.11.10
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.source.learn.aop*")
public class AopConfig {
}
