package com.wcxu.aop.within;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class logUtil {

	public void log1() {
		System.out.println("前置通知：调用log1() 记录日志");
	}

	public void log2() {
		System.out.println("后置通知：调用log2() 记录日志");
	}

	public void log3() {
		System.out.println("最终通知：调用log3() 记录日志");
	}

	public void log4(Exception e) {
		System.out.println("异常通知：调用log4() 记录日志");
		String error = e.getStackTrace()[0].toString();
		System.out.println(error);
	}

	public Object log5(ProceedingJoinPoint p) throws Throwable {
		System.out.println("环绕通知：调用log5() 记录前置");
		// 调用目标组件
		Object obj = p.proceed();
		System.out.println("环绕通知：调用log5() 记录后置");
		return obj;
	}
}
