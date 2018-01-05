package com.wcxu.autowiring.PC;

public class MoveDisk implements USB{

	@Override
	public void usb() {
		System.out.println("从移动硬盘拷贝数据");
	}

}
