package com.wcxu.aop.annotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	public void save() {
		System.out.println("新增员工");
		int a = 1 / 0; // 用于测试after和after-returning区别
	}

	public void update() {
		System.out.println("修改员工");
	}

	public void delete() {
		System.out.println("删除员工");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmpService service = context.getBean(EmpService.class);
		System.out.println("目标组件：" + service.getClass().getName());
		service.save();
	}
}
