package com.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements InitializingBean {

	@Value("${my.password}")
	private String value;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("clearpass".equals(value) + " >>> " + value);
	}
}
