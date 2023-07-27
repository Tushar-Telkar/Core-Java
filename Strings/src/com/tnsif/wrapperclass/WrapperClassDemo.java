package com.tnsif.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//unboxing 
		Integer i=new Integer(10);
		System.out.println(i);
		
		//without using intValue()
		int b=i;
		System.out.println(b);
		
		int c=i.intValue();
		System.out.println(c);
		
		Integer j=c;
		System.out.println(j);
	}

}
