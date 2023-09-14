package com.xworkz.microsoft.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.microsoft.configuration.FounderInfo;
import com.xworkz.microsoft.configuration.Linux;
import com.xworkz.microsoft.configuration.Mac;
import com.xworkz.microsoft.configuration.Microsoft;
import com.xworkz.microsoft.configuration.Windows;

@ComponentScan("com.xworkz")
public class Controller {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FounderInfo.class);

		Microsoft microsoft = new Microsoft();
		Windows windows = new Windows();
		Linux linux = new Linux();
		Mac mac = new Mac();

		System.out.println("Microsoft Founder: " + microsoft.getFounderInfo());
		System.out.println("Windows Founder: " + windows.getFounderInfo());
		System.out.println("Linux Founder: " + linux.getFounderInfo());
		System.out.println("Mac Founder: " + mac.getFounderInfo());
	}
}
