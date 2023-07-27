package com.tnsif.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		
		String s;
		int a=42;
		sb=new StringBuffer();
		s=sb.append("Value of a:").append(a).append("$").toString();
		System.out.println(s);
		System.out.println(sb);
		sb.insert(10, " is ");
		System.out.println(sb);
		sb.delete(11, 14);
		System.out.println(sb);
	}

}
