package com.wcxu.annotation.PC;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	@Resource(name = "u2", type = MoveDisk.class)
	private USB usb;

	public Computer() {

	}

	public Computer(USB usb) {
		super();
		this.usb = usb;
	}

	public void readInfo() {
		// 调用USB存储设备
		System.out.println("进行数据读取");
		usb.usb();
	}

	public USB getUsb() {
		return usb;
	}

	public void setUsb(USB usb) {
		this.usb = usb;
	}
}
