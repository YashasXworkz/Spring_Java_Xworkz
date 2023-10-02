package com.xworkz.rtofine.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class RtoFineConfiguration {
	public RtoFineConfiguration() {
		System.out.println("Invoked RtoFineConfiguration");
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Invoked ViewResolver Bean");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean lcefb() {
		System.out.println("Invoked LocalContainerEntityManagerFactoryBean Bean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		System.out.println(bean);
		return bean;
	}
}
