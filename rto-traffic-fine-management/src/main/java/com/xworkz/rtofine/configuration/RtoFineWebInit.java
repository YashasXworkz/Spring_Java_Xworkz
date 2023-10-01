package com.xworkz.rtofine.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RtoFineWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Invoked getRootConfigClasses");
		return new Class[] { RtoFineConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Invoked getServletMappings");
		return new String[] { "/" };
	}
}
