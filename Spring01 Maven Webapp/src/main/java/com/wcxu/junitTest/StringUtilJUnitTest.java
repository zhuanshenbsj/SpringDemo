package com.wcxu.junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilJUnitTest {

	@BeforeClass
	public static void initClass() {
		System.out.println("*****before*****");
	}

	@AfterClass
	public static void endClass() {
		System.out.println("*****after*****");
	}

	@Before
	public void init() {
		System.out.println("=====before====");
	}

	@After
	public void end() {
		System.out.println("=====end====");
	}

	@Test
	public void test1() {
		System.out.println("=====test1====");
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.concat("abc", "123");
		Assert.assertEquals("abc123", actual);

	}

	@Test
	public void test2() {
		System.out.println("=====test2====");
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.concat("a  bc", "1 2 3");
		Assert.assertEquals("abc123", actual);
	}

	@Test
	public void test3() {
		System.out.println("=====test3====");
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.concat(null, "1 2 3");
		Assert.assertEquals("123", actual);
	}

	@Test
	public void test4() {
		System.out.println("=====test4====");
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.concat("ab   c", null);
		Assert.assertEquals("abc", actual);
	}

	@Test
	public void test5() {
		System.out.println("=====test5====");
		StringUtil stringUtil = new StringUtil();
		String actual = stringUtil.concat(null, null);
		Assert.assertEquals("", actual);
	}
}
