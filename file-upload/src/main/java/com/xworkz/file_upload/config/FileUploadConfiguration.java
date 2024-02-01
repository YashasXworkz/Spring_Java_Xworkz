package com.xworkz.file_upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class FileUploadConfiguration {
	public FileUploadConfiguration() {
		System.out.println("Invoked FileUploadConfiguarion");
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Invoked ViewResolver Bean");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
