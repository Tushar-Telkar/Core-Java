package com.tnsif.abstractiondemo;

public class AbstractionDemo {

	public static void main(String[] args) {
		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle();
		r.calArea();
		r.show();
		
		//dynamic binding//runtime polymorshism//loose coupling
		
		Shape shape;
		shape=new Square(4.0f);
		shape.calArea();
		shape.show();
		
		shape=new Rectangle(9.0f,2.0f);
		shape.calArea();
		shape.show();
	}

}
