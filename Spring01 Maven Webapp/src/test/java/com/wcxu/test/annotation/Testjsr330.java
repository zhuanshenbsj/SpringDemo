package com.wcxu.test.annotation;

import org.junit.Test;

import com.wcxu.annotation.jsr330.UserServiceImpl;
import com.wcxu.test.base.UnitTestBase;

public class Testjsr330 extends UnitTestBase {

	public Testjsr330() {
		super("annotation/acjsr330.xml");
	}

	@Test
	public void test01() {
		UserServiceImpl impl = this.getBean("userServiceImpl");
		impl.done();
	}
}
