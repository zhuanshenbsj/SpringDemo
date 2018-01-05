package com.wcxu.test.autowiring;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {

	@Test
	public void test() {
		String conf = "autowiring/applicationContext.xml";
		// 实例化Spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		System.out.println(ac);
		Calendar c1 = ac.getBean("c1", Calendar.class);
		System.out.println(c1);
		Calendar c2 = ac.getBean("c2", Calendar.class);
		System.out.println(c2);
		Date c3 = ac.getBean("c3", Date.class);
		System.out.println(c3);
	}

	@Test // 测试spring容器创建组件对象
	public void test1() {
		// 1.采用构造器方式创建对象
		Calendar c1 = new GregorianCalendar();
		System.out.println(c1);

		// 2.采用工厂静态方法创建对象
		Calendar c2 = Calendar.getInstance();
		System.out.println(c2);

		// 3.采用工厂对象方法
		Date d1 = c2.getTime();
		System.out.println(d1);
	}
}
