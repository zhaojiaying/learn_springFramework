package com.source.learn;

import com.source.learn.ioc_BeanPostProcess.InterfaceBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 学习spring IOC 入口程序
 *
 * @author: jiayingzhao
 * @Date: 2019.10.26
 */
public class IocMain {

	public static void main(String[] args) {

		//把类扫描出来,把bean实例化
		AnnotationConfigApplicationContext ac
				= new AnnotationConfigApplicationContext(IocConfig.class);
		/**
		 * spring拿到之后步骤
		 * 1、new一个beanDefinition(用来描述spring bean的)
		 * for(for循环包里的满足spring规则的类,并创建成beanDefination){
		 * 			RootBeanDefinition beanDefinition = new RootBeanDefinition();
		 * 			beanDefinition.setBeanClassName("bean");
		 * 			beanDefinition.setBeanClass(BeanTest.class);
		 * 			beanDefinition.setScope("prototype");
		 * 			......
		 * 			map.put("city",BeanDefinition);
		 *}
		 * 扫描完，满足条件的类都在map中
		 * 解析
		 */
		/*System.out.println(ac.getBean(BeanTest.class));*/
		/**
		 * selfBean直接执行会报错，因为SelfBean没有加注解，没有注册进spring容器,
		 * 现在要通过自己定义的beanFactoryPostProcess类来改变spring的构建过程，进行一个“偷梁换柱”
		 */
		/*System.out.println(ac.getBean(SelfBean.class));*/
		//getBean中传入的参数如果是Imp类，报错，因为在新创建的后置处理器中使用了Proxy动态代理，传入的参数必须为接口类,
		//否则AbstractBeanFactory类的isTypeMatch()方法的语句typeToMatch.isInstance()为false获取不到对象
		/**
		 * 测试spring后置处理器，InterfaceAop
		 */
		InterfaceBean bean = ac.getBean(InterfaceBean.class);
		/**
		 * AopTest实现了BeanPostProcessor接口，spring会执行所有的后置处理器
		 * 在AopTest中重写了postProcessAfterInitialization方法，方法中使用了Proxy代理
		 *
		 * bean.query()：方法query就是InvocationHandler中invoke方法传入的method
		 */
		bean.query();
		bean.read();
	}

}
