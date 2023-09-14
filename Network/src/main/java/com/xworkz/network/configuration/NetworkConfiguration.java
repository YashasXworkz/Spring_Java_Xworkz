package com.xworkz.network.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class NetworkConfiguration {
	public NetworkConfiguration() {
		System.out.println("Invoked NetworkConfiguration");
	}
}
