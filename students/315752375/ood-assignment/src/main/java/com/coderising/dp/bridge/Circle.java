package com.coderising.dp.bridge;

public class Circle extends Shape {
	private Point point;
	private int r;
	public Circle(Point point,int r,Drawing drawing) {
		this.point=point;
		this.r=r;
		this.drawing=drawing;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.drawing.drawCircle(point.x, point.y, r);
	}

}
