package com.wcxu.annotation.beanContainerGeneric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

	//不使用@Qualifier的话因为printStore也返回StringStore，会导致循环引用报错（printStore->storeStr->printStore）。
	@Autowired
	@Qualifier("storeStr")
	private Store<String> storeStr;
	@Autowired
	@Qualifier("storeInt")
	private Store<Integer> storeInt;

	@Bean(name = "storeStr")
	//@Bean
	public StringStore getStringStore() {
		return new StringStore();
	}

	@Bean(name = "storeInt")
	//@Bean
	public IntegerStore getIntegerStore() {
		return new IntegerStore();
	}

	@Bean(name = "printStore")
	public Store printStore() {
		System.out.println("storeStr" + storeStr.getClass().getName());
		System.out.println("storeInt" + storeInt.getClass().getName());
		return new StringStore();
	}
}
