package com.coderising.dp.composite;

public class Square implements Shape {
	private String name;

	public Square(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is a square:" + name);
	}

}
