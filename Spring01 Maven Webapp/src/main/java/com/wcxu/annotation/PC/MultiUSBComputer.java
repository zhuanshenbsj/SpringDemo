package com.wcxu.annotation.PC;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 相同类型用@Autowired可以注入到set list中
 * @Order可以设置顺序
 */
@Component
public class MultiUSBComputer {

	@Autowired
	private List<USB> usbList;

	@Autowired
	private Map<String, USB> usbMap;

	public MultiUSBComputer() {

	}

	public void showAllUSBDevicesbyList() {
		if (null != usbList && 0 != usbList.size()) {
			for (USB usb : usbList) {
				System.out.println(usb.getClass().getName());
			}
		} else {
			System.out.println("usbList is null!");
		}
	}

	public void showAllUSBDevicesbyMap() {
		if (null != usbMap && 0 != usbMap.size()) {
			//			for (USB usb : usbMap.values()) {
			//				System.out.println(usb.getClass().getName());
			//			}
			for (Map.Entry<String, USB> usb : usbMap.entrySet()) {
				System.out.println(usb.getKey() + " " + usb.getValue());
			}
		} else {
			System.out.println("usbList is null!");
		}
	}
}
