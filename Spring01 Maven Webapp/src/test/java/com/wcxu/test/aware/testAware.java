package com.wcxu.test.aware;

import org.junit.Test;

import com.wcxu.test.base.UnitTestBase;

public class testAware extends UnitTestBase {

	public testAware() {
		//test01 测试ApplicationContextAware
		//super("aware/appContextAware.xml");
		//test02 测试BeanNameAware
		//super("aware/appContextAware1.xml");
		//test02 测试BeanNameAware和ApplicationContextAware
		super("aware/appContextAware2.xml");
	}

	@Test
	public void test01() {
		System.out.println("test:" + super.getBean("ac"));
	}

	@Test
	public void test02() {
	}

	@Test
	public void test03() {
		System.out.println("test:" + super.getBean("d").hashCode());
	}
}
