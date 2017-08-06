package com.coderising.dp.bridge;

public abstract class Shape {
	protected Drawing drawing;

	public Drawing getDrawing() {
		return drawing;
	}

	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}
	public abstract void draw(); 
}
