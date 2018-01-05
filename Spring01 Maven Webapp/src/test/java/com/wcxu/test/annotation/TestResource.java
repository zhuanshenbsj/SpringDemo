package com.wcxu.test.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResource {

	@Test
	public void test01() {
		String conf = "annotation/acAutoWired.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		com.wcxu.annotation.UserInfoAutoWired.UserServiceImpl uService = ac.getBean("userServiceImpl",
				com.wcxu.annotation.UserInfoAutoWired.UserServiceImpl.class);
		uService.done();

	}//

	@Test
	public void test02() {
		String conf = "annotation/acResource.xml";
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		com.wcxu.annotation.UserInfoResource.UserServiceImpl uService = ac.getBean("userServiceImpl",
				com.wcxu.annotation.UserInfoResource.UserServiceImpl.class);
		uService.done();
		ac.registerShutdownHook();//singleton模式必须关闭ac才能执行@PreDestroy
	}
}
