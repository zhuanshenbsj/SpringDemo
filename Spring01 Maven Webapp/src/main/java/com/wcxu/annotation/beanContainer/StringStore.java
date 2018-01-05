package com.wcxu.annotation.beanContainer;

public class StringStore implements Store {

	public void init() {
		System.out.println("this is init");
	}

	public void destory() {
		System.out.println("this is destory");
	}
}
