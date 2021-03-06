package com.ioc.example;

import org.apache.taglibs.standard.lang.jstl.test.beans.Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {

	
	public static void main(String args[]) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle = context.getBean("circle", Circle.class);
		
		circle.draw();
	}
}
