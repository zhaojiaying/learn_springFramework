package com.source.learn.aop_aspectJSupport;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义一个切面 @Aspect 表明该类是一个切面
 * 在类中添加一个方法，方法上添加@PointCut注解，就声明好了切点
 * 并且 @PointCut注解的 参数 即 连接点
 *
 *
 * ps: 在pointCut中指定需要在哪里加入切面方法：通过在@PointCut中的exection（传入需要加入方法的某函数的路径）
 * 		在advice方法上加需要将通知加到哪里的注解，如@Before，括号里指定切点，明确是在@PointCut指定方法的哪个时间加入advice里的方法
 *
 * @author: jiayingzhao
 * @Date: 2019.11.10
 */
@Component
@Aspect
public class TestAspect {

	/**
	 * 切点，表明在execution（指定的位置）加入 切面方法
	 */
	@Pointcut("execution(* com.source.learn.aop_aspectJSupport..*.*(..))")
	public void pointCutAopTestBeanImp(){
	}


	/**
	 * 注解@Before，是一个通知，方法执行在哪一个切点的before，需要传入参数
	 */
	@Before("pointCutAopTestBeanImp()")
	public void aopTestBeanImpAdvice(){
		System.out.println("aop befor -- 日志");
	}

	/*------------------------------------------------------------------------------------------------------------------*/

	/**
	 * 切点：指定在某类中的method方法中加入切面方法
	 */
	@Pointcut("execution(* com.source.learn.aop_aspectJSupport.*.method(..))")
	public void pointCutTestMethod(){
	}

	@After("pointCutTestMethod()")
	public void testMethodAdvice(){
		System.out.println("aop After -- 日志");
	}


}
