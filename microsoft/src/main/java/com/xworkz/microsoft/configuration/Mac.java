package com.xworkz.microsoft.configuration;

import org.springframework.stereotype.Component;

@Component
public class Mac implements Software {
	String founderName = "Steve Jobs";

	@Override
	public String getFounderInfo() {
		return founderName;
	}
}
