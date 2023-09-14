package com.xworkz.aircondition.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class AirCondConfiguration {
	public AirCondConfiguration() {
		System.out.println("Invoked AirCondConfiguration");
	}
}
