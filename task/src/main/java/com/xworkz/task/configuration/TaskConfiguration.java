package com.xworkz.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class TaskConfiguration {

	public TaskConfiguration() {
		System.out.println("Invoked TaskConfiguration");
	}

	@Bean
	public String getName() {
		return new String("this is new name...");
	}

	@Bean
	public String getTrainee() {
		return new String("this is new name...");
	}
}
