package com.xworkz.aircondition.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AirCondWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public AirCondWebInit() {
		System.out.println("Invoked AirCondWebInit");
	}

	@Override
	public Class<?>[] getRootConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return null;
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return new Class[] { AirCondConfiguration.class };
	}

	@Override
	public String[] getServletMappings() {
		System.out.println("Invoked getServletMappings");
		return new String[] { "/" };
	}
}
