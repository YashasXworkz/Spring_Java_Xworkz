package com.xworkz.microsoft.configuration;

import org.springframework.stereotype.Component;

@Component
public class Windows implements Software {
	String founderName = "Paul Allen";

	@Override
	public String getFounderInfo() {
		return founderName;
	}
}
