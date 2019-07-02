package com.ioc.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Circle circle = context.getBean("circle", Circle.class);
		circle.setName("Oval");
		
		DrawShape shape1 = context.getBean("drawShape", DrawShape.class);

		shape1.getShape().draw();

	}
}
