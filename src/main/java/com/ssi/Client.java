package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("Starting Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context1=new ClassPathXmlApplicationContext("spring.xml");
	}
}

