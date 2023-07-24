package com.tnsif.abstractiondemo;

public class Square extends Shape{

	float side;
	
	//default constructor
	public Square() {
		side=2.0f;
	}



	//parameterized constructor
	public Square(float side) {
		this.side = side;
	}



	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}

	
}
