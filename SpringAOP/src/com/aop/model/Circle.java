package com.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle setter method is called");
	//	throw new IllegalArgumentException();
	}

	public String setNameAndReturn(String name1) {
		this.name = name1;
		System.out.println("Circle setter method is called");
		return name.toUpperCase();
	}

}
