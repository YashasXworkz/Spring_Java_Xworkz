package com.xworkz.network.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NetworkWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public NetworkWebInit() {
		System.out.println("Invoked NetworkWebInit");
	}

	@Override
	public Class<?>[] getRootConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return null;
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return new Class[] { NetworkConfiguration.class };
	}

	@Override
	public String[] getServletMappings() {
		System.out.println("Invoked getServletMappings");
		return new String[] { "/" };
	}
}
