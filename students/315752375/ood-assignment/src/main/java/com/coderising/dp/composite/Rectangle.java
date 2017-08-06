package com.coderising.dp.composite;

public class Rectangle implements Shape {
	private String name;

	public Rectangle(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is a rectangle:"+name);
	}

}
