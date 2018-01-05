package com.wcxu.test.annotation;

import org.junit.Test;

import com.wcxu.annotation.Scope.BeanScope;
import com.wcxu.test.base.UnitTestBase;

public class testScope extends UnitTestBase {

	public testScope() {
		super("annotation/acScope.xml");
	}

	/**
	 * prototype模式Hashcode不同
	 * 模式Hashcode相同
	 */
	@Test
	public void test01() {
		BeanScope bs = this.getBean("beanScope");
		//bs.say("hehe");
		bs.myHashCode();
		bs = this.getBean("beanScope");
		//bs.say("hehe");
		bs.myHashCode();
	}
}
