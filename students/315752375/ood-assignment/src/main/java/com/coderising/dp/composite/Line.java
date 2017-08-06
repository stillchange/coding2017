package com.coderising.dp.composite;

public class Line implements Shape {
	private String name;

	public Line(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("this is a line:" + name);

	}

}
