package com.wcxu.test.beanlifeCycle;

import org.junit.Test;

import com.wcxu.test.base.UnitTestBase;

public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle() {
		//test00
		//super("LifeCycle/appContextbeanlifeCycle0.xml");
		//test01
		//super("LifeCycle/appContextbeanlifeCycle1.xml");
		//test02
		//super("LifeCycle/appContextbeanlifeCycle2.xml");
		//test
		super("LifeCycle/appContextbeanlifeCycle.xml");
	}

	//测试bean中指定 的init-method="" destroy-method=""
	@Test
	public void test00() {
		super.getBean("bean");
	}

	//测试接口 InitializingBean, DisposableBean
	@Test
	public void test01() {
		super.getBean("bean");
	}

	//测试全局的 default init ; default destory
	@Test
	public void test02() {
		super.getBean("bean");
	}

	//联合测试
	//此时bean本身的 init-method="" destroy-method=""和InitializingBean, DisposableBean 生效
	//且执行顺序 InitializingBean init-method DisposableBean  destroy-method
	//同时全局 default方法不生效
	@Test
	public void test() {
		super.getBean("bean");
	}
}
