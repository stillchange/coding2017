package com.coderising.dp.bridge;

public class DrawingGL1 extends Drawing {
	GraphicLibrary1 g1=new GraphicLibrary1();
	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		g1.draw_a_line(x1, y1, x2, y2);
	}

	@Override
	public void drawCircle(int x, int y, int r) {
		// TODO Auto-generated method stub
		g1.draw_a_circle(x, y, r);
	}

	

}
