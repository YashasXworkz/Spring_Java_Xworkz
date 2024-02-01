package com.xworkz.rto.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RtoWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("getServletConfigClasses is running");
		return new Class[] { RtoConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("getServletMappings is running");
		return new String[] { "/" };
	}
}
