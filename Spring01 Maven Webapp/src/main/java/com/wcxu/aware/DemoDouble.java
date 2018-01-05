package com.wcxu.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoDouble implements ApplicationContextAware, BeanNameAware {

	private String beanName = "";

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		System.out.println("beanName:" + this.beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ApplicationContext:" + arg0);
		System.out.println("beanValue:" + arg0.getBean(this.beanName).hashCode());
	}

}
