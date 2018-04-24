package com.poc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		int result = applicationContext.getBean(BinarySearchImpl.class).binarySearch(new int[] { 1, 3, 4 }, 3);
		System.out.println(result);
	}
}
