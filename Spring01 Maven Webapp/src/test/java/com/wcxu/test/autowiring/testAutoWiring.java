package com.wcxu.test.autowiring;

import org.junit.Test;

import com.wcxu.autowiring.AutoWiringService;
import com.wcxu.test.base.UnitTestBase;

public class testAutoWiring extends UnitTestBase {

	public testAutoWiring() {
		//test01 byname
		//super("autowiring/appContextByName.xml");

		//test02 bytype
		//super("autowiring/appContextByName.xml");

		//test03 constructor
		super("autowiring/appContextConstructor.xml");
	}

	//byname
	@Test
	public void test01() {
		AutoWiringService service = super.getBean("service");
		service.saysth("hehe");
	}

	//byname
	@Test
	public void test02() {
		AutoWiringService service = super.getBean("service");
		service.saysth("hehe");
	}

	//constructor
	@Test
	public void test03() {
		AutoWiringService service = super.getBean("service");
		service.saysth("hehe");
	}
}
