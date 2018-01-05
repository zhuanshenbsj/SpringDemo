package com.wcxu.annotation.beanContainer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource读取配置文件
 * @author user
 *
 */
@Configuration
@PropertySource("classpath:/annotation/config.properties")
public class dbConfig1 {
	@Value("${url}")
	private String url;

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	@Bean(name = "driverManager1")
	public MyDriverManager getMyDriverManager() {
		return new MyDriverManager(url, username, password);
	}
}
