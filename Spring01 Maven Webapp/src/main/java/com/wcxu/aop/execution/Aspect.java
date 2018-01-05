package com.wcxu.aop.execution;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {

	public void before() {
		System.out.println("aspect before");
	}

	public void afterreturning() {
		System.out.println("aspect afterreturning");
	}

	public void afterthrowing() {
		System.out.println("aspect afterthrowing");
	}

	public void after() {
		System.out.println("aspect after");
	}

	public Object around(ProceedingJoinPoint pjp) {
		Object object = null;
		try {
			System.out.println("aspect around 1");
			object = pjp.proceed();
			System.out.println("aspect around 2");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}

	public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {

		System.out.println(bizName + " " + times);
		Object object = null;
		try {
			System.out.println("aspect aroundInit 1");
			object = pjp.proceed();
			System.out.println("aspect aroundInit 2");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
