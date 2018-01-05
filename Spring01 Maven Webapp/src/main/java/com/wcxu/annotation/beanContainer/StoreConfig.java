package com.wcxu.annotation.beanContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

	@Bean(name = "store", initMethod = "init", destroyMethod = "destory")
	public Store getStringStore() {
		return new StringStore();
	}

}
