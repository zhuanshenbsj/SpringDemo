package com.wcxu.aop.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logUtil {

	@Before("within(com.wcxu.aop.annotation.service.*)")
	public void log1() {
		System.out.println("前置通知：调用log1() 记录日志");
	}

	@AfterReturning("within(com.wcxu.aop.annotation.service.*)")
	public void log2() {
		System.out.println("后置通知：调用log2() 记录日志");
	}

	@After("within(com.wcxu.aop.annotation.service.*)")
	public void log3() {
		System.out.println("最终通知：调用log3() 记录日志");
	}

	@AfterThrowing(pointcut = "within(com.wcxu.aop.annotation.service.*)", throwing = "e")
	public void log4(Exception e) {
		System.out.println("异常通知：调用log4() 记录日志");
		String error = e.getStackTrace()[0].toString();
		System.out.println(error);
	}

	@Around("within(com.wcxu.aop.annotation.service.*)")
	public Object log5(ProceedingJoinPoint p) throws Throwable {
		System.out.println("环绕通知：调用log5() 记录前置");
		// 调用目标组件
		Object obj = p.proceed();
		System.out.println("环绕通知：调用log5() 记录后置");
		return obj;
	}
}
