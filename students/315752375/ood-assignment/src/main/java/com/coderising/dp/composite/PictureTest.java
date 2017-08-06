package com.coderising.dp.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PictureTest {

	private Picture root;

	@Before
	public void setUp() throws Exception {
		root = new Picture("root");
	}

	@Test
	public void testAddShape() {
		System.out.println("test add");
		Picture p2=new Picture("p2");
		Line l1=new Line("l1");
		Rectangle r1=new Rectangle("r1");
		root.addShape(p2);
		root.addShape(l1);
		root.addShape(r1);
		
		Text t1=new Text("t1");
		Line l2=new Line("l2");
		Square s1=new Square("s1");
		p2.addShape(t1);
		p2.addShape(l2);
		p2.addShape(s1);
		
		root.draw();
	}

	@Test
	public void testRemoveShape() {
		System.out.println("test remove");
		Picture p2=new Picture("p2");
		Line l1=new Line("l1");
		Rectangle r1=new Rectangle("r1");
		root.addShape(p2);
		root.addShape(l1);
		root.addShape(r1);
		
		Text t1=new Text("t1");
		Line l2=new Line("l2");
		Square s1=new Square("s1");
		p2.addShape(t1);
		p2.addShape(l2);
		p2.addShape(s1);
		
		root.removeShape(r1);
		root.draw();
	}

}
