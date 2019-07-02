package com.ioc.example;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Calling Triangle set method");
		
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle " + name);
	}

}
