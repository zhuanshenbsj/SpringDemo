package com.wcxu.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class DemoResource implements ApplicationContextAware {

	private ApplicationContext ac;

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		ac = arg0;
	}

	public void resource() throws IOException {
		//默认方式即为classpath方式
		Resource resource = ac.getResource("classpath:config.txt");

		//file方式
		//Resource resource = ac.getResource(
		//"file:D:/code/java/myeclipse2017/20171201/Spring01 Maven Webapp/src/main/resources/config.txt");

		//url方式
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
