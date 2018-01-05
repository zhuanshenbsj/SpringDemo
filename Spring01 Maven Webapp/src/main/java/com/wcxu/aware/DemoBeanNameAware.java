package com.wcxu.aware;

import org.springframework.beans.factory.BeanNameAware;

public class DemoBeanNameAware implements BeanNameAware {

	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
	}

}
