package com.xworkz.microsoft.controller;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.microsoft.configuration.FounderInfo;
import com.xworkz.microsoft.configuration.Linux;
import com.xworkz.microsoft.configuration.Mac;
import com.xworkz.microsoft.configuration.Microsoft;
import com.xworkz.microsoft.configuration.Windows;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FounderInfo.class);
		int beans = context.getBeanDefinitionCount();
		System.out.println(beans);

		String[] beanss = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanss));

		Linux linux = (Linux) context.getBean("linux");
		System.out.println(linux.getFounderInfo());

		Mac mac = (Mac) context.getBean("mac");
		System.out.println(mac.getFounderInfo());

		Microsoft microsoft = (Microsoft) context.getBean("microsoft");
		System.out.println(microsoft.getFounderInfo());

		Windows win = (Windows) context.getBean("windows");
		System.out.println(win.getFounderInfo());

		/*
		 * Microsoft microsoft = new Microsoft();
		 * Windows windows = new Windows();
		 * Linux linux = new Linux();
		 * Mac mac = new Mac();
		 * System.out.println("Microsoft Founder: " + microsoft.getFounderInfo());
		 * System.out.println("Windows Founder: " + windows.getFounderInfo());
		 * System.out.println("Linux Founder: " + linux.getFounderInfo());
		 * System.out.println("Mac Founder: " + mac.getFounderInfo());
		 */
	}
}
