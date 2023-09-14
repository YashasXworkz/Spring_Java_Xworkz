package com.xworkz.microsoft.configuration;

import org.springframework.stereotype.Component;

@Component
public class Linux implements Software {
	String founderName = "Linus Torvalds";

	@Override
	public String getFounderInfo() {
		return founderName;
	}
}
