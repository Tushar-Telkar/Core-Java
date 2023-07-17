package com.tnsif.defaultDemo;

public class Base {

	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("Default method");
		System.out.println("varDefault ="+varDefault);
	}
	public void methodPublic()
	{
		System.out.println("Public method");
		System.out.println("varPublic ="+varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("Private method");
		System.out.println("varPrivate ="+varPrivate);
	}
	protected void methodProtected()
	{
		System.out.println("Protected method");
		System.out.println("varProtected ="+varProtected);
	}
	public void access()
	{
		methodProtected();
	}
	public static void main(String args[])
	{
		Base b=new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodPrivate();
		b.methodProtected();
	}
}
