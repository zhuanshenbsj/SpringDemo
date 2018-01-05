package com.wcxu.annotation.PC;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component("u1")
@Scope("prototype") // 多例，即每次都创建一个新对象，单例为singleton(默认)
public class UDisk implements USB {
	@Override
	public void usb() {
		System.out.println("u盘通过USB传输数据至电脑");
	}
}
