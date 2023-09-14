package com.xworkz.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrapperConfiguration {

	public WrapperConfiguration() {
		System.out.println("Invoked WrapperConfiguration");
	}

	@Bean
	public Integer getIntegerWrapper() {
		System.out.println("this is Integer");
		return Integer.valueOf(20);
	}

	@Bean
	public Double getDoubleWrapper() {
		System.out.println("this is Double");
		return Double.valueOf(20.0);
	}

	@Bean
	public Character getCharacterWrapper() {
		System.out.println("this is Character");
		return Character.valueOf('A');
	}

	@Bean
	public Boolean getBooleanWrapper() {
		System.out.println("this is Boolean");
		return Boolean.valueOf(true);
	}
}
