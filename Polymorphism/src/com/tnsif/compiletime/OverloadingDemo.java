package com.tnsif.compiletime;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(2);
		System.out.println(p1);
		
		Point p2=new Point(3,4);
		System.out.println(p2);
		
		Addition add=new Addition();
		add.addition(15, 42);
	}

}
