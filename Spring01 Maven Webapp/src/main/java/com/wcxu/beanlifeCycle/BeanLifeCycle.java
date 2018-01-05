package com.wcxu.beanlifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	public void start() {
		System.out.println("bean start");
	}

	public void stop() {
		System.out.println("bean stop");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean afterPropertiesSet");

	}
}
