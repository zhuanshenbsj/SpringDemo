package com.wcxu.annotation.PC;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component("u2")
@Scope("singleton") //默认即为单例模式
public class MoveDisk implements USB {

	@Override
	public void usb() {
		System.out.println("从移动硬盘拷贝数据");
	}

}
