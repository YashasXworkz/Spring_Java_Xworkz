package com.xworkz.task.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.TaskConfiguration;

public class TaskRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);
		int beanContext = context.getBeanDefinitionCount();
		System.out.println(beanContext);

		System.out.println("-------get beans-------");

		String[] beanNames = context.getBeanDefinitionNames();
		for (String names : beanNames) {
			System.out.println(names);
		}
	}
}
