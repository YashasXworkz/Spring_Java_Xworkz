package com.xworkz.rtofine.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class RtoFineConfiguration {
	public RtoFineConfiguration() {
		System.out.println("Invoked RtoFineConfiguration");
	}
}
