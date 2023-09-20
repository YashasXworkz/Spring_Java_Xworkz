package com.xworkz.network.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class NetworkConfiguration {
	public NetworkConfiguration() {
		System.out.println("Invoked NetworkConfiguration");
	}
}
