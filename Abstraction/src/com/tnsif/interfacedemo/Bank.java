package com.tnsif.interfacedemo;

public interface Bank {
	
	final static float MINBAL=5000;
	final static float DEPOSIT_LIMIT=25000;
	public void deposite(float amount);
	public void withdraw(float amount);
	
	default void show() {
		System.out.println("Hello");
	}
	static void print() {
		
	}
}
