package com.ioc.example;

import org.apache.taglibs.standard.lang.jstl.test.beans.Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {

	
	public static void main(String args[]) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Circle circle = factory.getBean("circle", Circle.class);
		
		circle.draw();
	}
}
