package com.tnsif.abstractiondemo;

public class Rectangle extends Shape{

	float width,height;
	
	//default constructor	
	public Rectangle() {
		width=7.0f;
		height=2.0f;
	}
	
	//parameterized constructor
	public Rectangle(float width, float height) {
		
		this.width = width;
		this.height = height;
	}


	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=width*height;
	}
	

}
