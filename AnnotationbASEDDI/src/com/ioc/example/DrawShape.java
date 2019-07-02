package com.ioc.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawShape {

	@Autowired
	@Qualifier("circle")
	Shape shape;

	
	public DrawShape() {
		// TODO Auto-generated constructor stub
	}
	public DrawShape(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	
	
}
