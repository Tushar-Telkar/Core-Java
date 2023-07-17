package com.tnsif.defaultDemo;

public class Executor {

	public static void main(String args[])
	{
		Base b=new Base();
		b.methodDefault();
		b.methodPublic();
		//b.methodPrivate();
		b.methodProtected();
		
	}
}
