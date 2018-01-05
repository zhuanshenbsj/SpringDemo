package com.wcxu.test.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcxu.annotation.PC.Computer;
import com.wcxu.annotation.PC.MoveDisk;
import com.wcxu.annotation.PC.MultiUSBComputer;
import com.wcxu.annotation.PC.UDisk;

public class TestPC {

	@Test
	public void test01() {
		String conf = "annotation/appContextAnnotation.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		Computer c1 = ac.getBean("computer", Computer.class);
		UDisk u1 = ac.getBean("u1", UDisk.class);
		c1.setUsb(u1);
		c1.readInfo();
		MoveDisk u2 = ac.getBean("u2", MoveDisk.class);
		c1.setUsb(u2);
		c1.readInfo();
	}

	/**
	 * singleton 和  prototype
	 */
	@Test
	public void test02() {
		String conf = "annotation/appContextAnnotation.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

		UDisk u1 = ac.getBean("u1", UDisk.class);
		UDisk u2 = ac.getBean("u1", UDisk.class);
		System.out.println(u1);
		System.out.println(u2);

		MoveDisk m1 = ac.getBean("u2", MoveDisk.class);
		MoveDisk m2 = ac.getBean("u2", MoveDisk.class);
		System.out.println(m1);
		System.out.println(m2);
	}

	// Resource(name,type)/Autowire
	@Test
	public void test03() {
		String conf = "annotation/appContextAnnotation.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		Computer c1 = ac.getBean("computer", Computer.class);
		c1.readInfo();
	}

	/**
	 * 相同类型可以注入到set list中
	 */
	@Test
	public void test04() {
		String conf = "annotation/appContextAnnotation.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		MultiUSBComputer c1 = ac.getBean("multiUSBComputer", MultiUSBComputer.class);
		c1.showAllUSBDevicesbyMap();
		//c1.showAllUSBDevicesbyList();
	}
}
