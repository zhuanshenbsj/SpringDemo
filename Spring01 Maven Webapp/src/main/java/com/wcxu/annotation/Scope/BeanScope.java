package com.wcxu.annotation.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton") singleton即默认
public class BeanScope {

	public void say(String str) {
		System.out.println("BeanAnnotation" + str);
	}

	public void myHashCode() {
		System.out.println("BeanAnnotation" + this.hashCode());
	}
}
