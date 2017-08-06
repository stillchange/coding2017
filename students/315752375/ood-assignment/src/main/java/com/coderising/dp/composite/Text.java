package com.coderising.dp.composite;

public class Text implements Shape {
	private String name;

	public Text(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is a text:" + name);
	}

}
