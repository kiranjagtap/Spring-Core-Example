package com.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	String name;
	
	@Autowired
	Point center123;

	@Override
	public void draw() {
		System.out.println("Drawing Circle " + name +" having point X=" +this.center123.getX() +" and point y="+this.center123.getY());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Calling Circle set method");

		this.name = name;
	}

	public Point getCenter123() {
		return center123;
	}

	public void setCenter123(Point center123) {
		this.center123 = center123;
	}

	
}
