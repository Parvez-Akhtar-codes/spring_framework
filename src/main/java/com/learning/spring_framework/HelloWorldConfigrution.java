package com.learning.spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfigrution {
	@Bean
	public String name() {
		return "junaid";
	}
}
