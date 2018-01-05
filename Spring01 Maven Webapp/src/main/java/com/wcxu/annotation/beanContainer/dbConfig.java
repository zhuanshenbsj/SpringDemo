package com.wcxu.annotation.beanContainer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource读取配置文件
 * @author user
 *
 */
@Configuration
@ImportResource("classpath:annotation/dbconfig.xml")
public class dbConfig {
	@Value("${url}")
	private String url;

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	@Bean(name = "driverManager")
	public MyDriverManager getMyDriverManager() {
		return new MyDriverManager(url, username, password);
	}
}
