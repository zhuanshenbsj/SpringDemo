package com.wcxu.test.resource;

import java.io.IOException;

import org.junit.Test;

import com.wcxu.resource.DemoResource;
import com.wcxu.test.base.UnitTestBase;

public class TestResource extends UnitTestBase {

	public TestResource() {
		super("appContextResource.xml");
	}

	@Test
	public void test01() throws IOException {
		DemoResource resource = super.getBean("res");
		resource.resource();
	}
}
