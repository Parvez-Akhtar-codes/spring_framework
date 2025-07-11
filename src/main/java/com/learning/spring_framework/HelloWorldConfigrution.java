package com.learning.spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String village , String city) {};
@Configuration
public class HelloWorldConfigrution {
	@Bean
	public String name() {
		return "junaid";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person() {
		return new Person("Ayan" , 15);
	}
	
	@Bean
	public Address address() {
		return new Address("Khunkhuna" , "Didwana");
	}
}
