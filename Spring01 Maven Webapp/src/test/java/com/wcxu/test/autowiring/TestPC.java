package com.wcxu.test.autowiring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcxu.autowiring.PC.Computer;

public class TestPC {
	@Test
	public void test1() {
		//		Computer c = new Computer();
		//		c.readInfo();
		//
		//		String conf = "applicationContext.xml";
		//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		//		Computer c1 = ac.getBean("computer1", Computer.class);
		//		c1.readInfo();
		String conf = "autowiring/applicationContext.xml";
		ApplicationContext ac1 = new ClassPathXmlApplicationContext(conf);
		Computer c2 = ac1.getBean("computer1", Computer.class);
		c2.readInfo();
	}

	@Test
	public void test2() {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		Computer c = ac.getBean("computer1", Computer.class);
		c.readInfo();
	}

	@Test
	public void test3() {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		Computer c = ac.getBean("computer2", Computer.class);
		c.readInfo();
	}
}
