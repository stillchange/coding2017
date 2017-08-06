package com.coderising.dp.bridge;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeTest {
	private Drawing drawing;
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;

	@Before
	public void setUp() throws Exception {
		p1 = new Point(1, 1);
		p2 = new Point(3, 1);
		p3 = new Point(3, 3);
		p4 = new Point(1, 3);

	}

	@Test
	public void testDraw() {
		{
			System.out.println("using lib1 to draw a rectangle");
			drawing=new DrawingGL1();
			Rectangle rectangle=new Rectangle(p1, p2, p3, p4, drawing);
			rectangle.draw();;
		}
		{
			System.out.println("using lib2 to draw rectangle");
			drawing=new DrawingGL2();
			Rectangle rectangle=new Rectangle(p1, p2, p3, p4, drawing);
			rectangle.draw();;
		}
		{
			System.out.println("using lib1 to draw a circle");
			drawing=new DrawingGL1();
			Circle circle=new Circle(p2, 5, drawing);
			circle.draw();
		}
		{
			System.out.println("using lib2 to draw a circle");
			drawing=new DrawingGL2();
			Circle circle=new Circle(p2, 5, drawing);
			circle.draw();
		}
	}

}
