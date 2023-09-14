package com.xworkz.microsoft.configuration;

import org.springframework.stereotype.Component;

@Component
public class Microsoft implements Software {
	String founderName = "Bill Gates";

	@Override
	public String getFounderInfo() {
		return founderName;
	}
}
