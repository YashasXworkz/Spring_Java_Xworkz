package com.xworkz.fashion_factory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class FashionFactConfiguration {

	public FashionFactConfiguration() {
		System.out.println("Invoked FashionFactConfiguration");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean lcefb() {
		System.out.println("Invoked LocalContainerEntityManagerFactoryBean Bean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		System.out.println(bean);
		return bean;
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
