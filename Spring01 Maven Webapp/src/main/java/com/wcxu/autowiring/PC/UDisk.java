package com.wcxu.autowiring.PC;

public class UDisk implements USB {

	@Override
	public void usb() {
		System.out.println("u盘通过USB传输数据至电脑");
	}

}
