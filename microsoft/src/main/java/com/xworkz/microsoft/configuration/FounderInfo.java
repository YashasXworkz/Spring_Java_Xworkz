package com.xworkz.microsoft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class FounderInfo {
	public FounderInfo() {
		System.out.println("Invoked FounderInfo");
	}

	@Bean
	public Microsoft getMicrosoft() {
		return new Microsoft();
	}

	@Bean
	public Windows getWindows() {
		return new Windows();
	}

	@Bean
	public Linux getLinux() {
		return new Linux();
	}

	@Bean
	public Mac getMac() {
		return new Mac();
	}
}
