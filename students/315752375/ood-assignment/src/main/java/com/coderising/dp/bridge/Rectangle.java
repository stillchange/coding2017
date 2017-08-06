package com.coderising.dp.bridge;

public class Rectangle extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	public Rectangle(Point p1,Point p2,Point p3,Point p4,Drawing drawing) {
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.drawing=drawing;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.drawing.drawLine(p1.x, p1.y, p2.x, p2.y);
		this.drawing.drawLine(p2.x, p2.y, p3.x, p3.y);
		this.drawing.drawLine(p3.x, p3.y, p4.x, p4.y);
		this.drawing.drawLine(p4.x, p4.y, p1.x, p1.y);
	}

}
