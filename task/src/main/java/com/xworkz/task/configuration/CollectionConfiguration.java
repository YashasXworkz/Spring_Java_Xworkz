package com.xworkz.task.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfiguration {

	public CollectionConfiguration() {
		System.out.println("Invoked CollectionConfiguration");
	}

	@Bean
	public ArrayList<String> getArrayList() {
		System.out.println("this is ArrayList");
		return new ArrayList<>();
	}

	@Bean
	public HashSet<String> getHashSet() {
		System.out.println("this is HashSet");
		return new HashSet<>();
	}

	@Bean
	public LinkedList<String> getLinkedList() {
		System.out.println("this is LinkedList");
		return new LinkedList<>();
	}

	@Bean
	public Queue<String> getQueue() {
		System.out.println("this is Queue");
		return new LinkedList<>();
	}
}
