package com.wcxu.test.annotation;

import org.junit.Test;

import com.wcxu.annotation.beanContainer.MyDriverManager;
import com.wcxu.test.base.UnitTestBase;

public class testBeanContainer extends UnitTestBase {

	public testBeanContainer() {
		//test ,testReadDbConfig
		//super("annotation/acBean.xml");

		//testGeneric
		super("annotation/acBeanGeneric.xml");
	}

	/**
	 * 测试bean
	 */
	@Test
	public void test() {
		//如果不加（name=""）,则默认以方法名为bean名
		//Store store = super.getBean("getStringStore");
		com.wcxu.annotation.beanContainer.Store store = super.getBean("store");
		System.out.println(store.getClass().getName());
	}

	/**
	 * 读取配置文件两种方式
	 * 1. @ImportResource 引入xml配置文件，再由xml的property-placeholder引入properties配置文件
	 * 2.@PropertySource 直接引入properties配置文件
	 */
	@Test
	public void testReadDbConfig() {
		MyDriverManager dm = super.getBean("driverManager");
		System.out.println(dm.getClass().getName());
		MyDriverManager dm1 = super.getBean("driverManager1");
		System.out.println(dm1.getClass().getName());
	}

	/**
	 * 测试泛型注解
	 */
	@Test
	public void testGeneric() {
		super.getBean("printStore");
		//System.out.println(store.getClass().getName());
	}
}
