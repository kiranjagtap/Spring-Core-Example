package com.ioc.example;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	String name;

	@Override
	public void draw() {
		System.out.println("Drawing Circle " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Calling Circle set method");
		
		this.name = name;
	}

}
