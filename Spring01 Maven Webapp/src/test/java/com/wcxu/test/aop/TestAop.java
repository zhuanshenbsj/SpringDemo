package com.wcxu.test.aop;

import org.junit.Test;

import com.wcxu.aop.HelloWorld;
import com.wcxu.aop.execution.AspectBiz;
import com.wcxu.aop.introduction.Filt;
import com.wcxu.aop.within.Service.EmpService;
import com.wcxu.test.base.UnitTestBase;

public class TestAop extends UnitTestBase {

	public TestAop() {
		//testtimeHandler
		//super("aop/acAop2.xml");

		//testtimeAndLogHandler
		//super("aop/acAop3.xml");

		//test03 筛选，只对某些函数生效
		//super("aop/acAop4.xml");

		//test04
		//super("aop/acExecution.xml");

		//testIntroduction 测试Introduction
		//super("aop/acIntroduction.xml");

		//testwithin 测试within子句
		//super("aop/acWithin.xml");

		//testAnnotation 测试Annotation子句
		super("aop/acWithinAnnotation.xml");
	}

	@Test
	public void testtimeHandler() {
		HelloWorld hw1 = this.getBean("helloWorldImpl1");
		HelloWorld hw2 = this.getBean("helloWorldImpl2");

		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}

	/**
	 * 使用order设置织入顺序
	 * 由外向内 1.before,2.before, ... ,2after,1.after
	 */
	@Test
	public void testtimeAndLogHandler() {
		HelloWorld hw1 = this.getBean("helloWorldImpl1");
		HelloWorld hw2 = this.getBean("helloWorldImpl2");

		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}

	/**
	 * test03 筛选，只对某些函数生效
	 */
	@Test
	public void test03() {
		HelloWorld hw1 = this.getBean("helloWorldImpl1");
		HelloWorld hw2 = this.getBean("helloWorldImpl2");

		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
	}

	/**
	 * 使用切点的时候
	 * 可以先定义一个 aop:pointcut,然后before用pointcut-ref调用它;
	 * 也可以在before中直接定义一个pointcut;
	 * 
	 * 出现异常会调用aop:after-throwing，但不会再调用aop:after-returning了
	 * 
	 * 
	 * 使用around时，需要将around配置到紧跟before之后即可，也就是around第一次应该出现的位置。
	否则会导致 after和afterreturning顺序错乱
	 */
	@Test
	public void test04() {
		AspectBiz biz = super.getBean("aspectBiz");
		//biz.biz();
		biz.init("haha", 1);
	}

	/**
	 * 测试Introduction
	 */
	@Test
	public void testIntroduction() {
		Filt filter = super.getBean("aspectBiz");
		filter.filter();
	}

	/**
	 * 测试within子句
	 */
	@Test
	public void testwithin() {
		EmpService empS = super.getBean("empService");
		empS.save();
	}

	/**
	 * 测试acWithinAnnotation
	 */
	@Test
	public void testAnnotation() {
		com.wcxu.aop.annotation.service.EmpService empS = super.getBean("empService");
		empS.save();
	}
}
