package com.coderising.dp.composite;

import java.util.LinkedList;
import java.util.List;

public class Picture implements Shape {
	private String name;
	List<Shape> shapes;

	public Picture(String name) {
		shapes = new LinkedList<>();
		this.name=name;
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	public void removeShape(Shape shape) {
		// TODO Auto-generated method stub
		shapes.remove(shape);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is a picture:"+name);
		for(Shape shape:shapes){
			shape.draw();
		}

	}

}
