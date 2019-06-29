package com.ioc.example;

import org.apache.taglibs.standard.lang.jstl.test.beans.Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DrawShape shape1 = context.getBean("drawShape", DrawShape.class);
		DrawShape shape2 = context.getBean("drawShape", DrawShape.class);
		
		System.out.println(shape1);
		System.out.println(shape2);
	
		/*Shape shape = new Triangle();
		
		Triangle triangle = new Triangle();
		triangle.setName("Triangle");
		
		Circle circle = new Circle();
		circle.setName("Circle");
		
		DrawShape drawShape = new DrawShape();
		
		drawShape.setShape(triangle);
		Shape shape1 = drawShape.getShape();
		
		
		shape1.draw();*/
	}
}
