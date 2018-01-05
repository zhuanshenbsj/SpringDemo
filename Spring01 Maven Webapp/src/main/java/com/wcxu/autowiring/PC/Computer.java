package com.wcxu.autowiring.PC;

public class Computer {

	public Computer() {

	}

	public Computer(USB u) {
		this.usb = u;
	}

	private USB usb;

	public void setUsb(USB u1) {
		this.usb = u1;
	}

	public void readInfo() {
		//调用USB存储设备
		System.out.println("进行数据读取");
		usb.usb();
	}
}
