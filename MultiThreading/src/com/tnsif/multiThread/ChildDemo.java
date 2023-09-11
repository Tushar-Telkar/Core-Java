package com.tnsif.multiThread;

public class ChildDemo {

	public static void main(String[] args) {
		
		ChildThread t=new ChildThread(10,"Hello");
		t.start();
		
		System.out.println("End of the program");

	}

}
