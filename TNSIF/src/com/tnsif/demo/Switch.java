package com.tnsif.demo;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='d';
		switch(ch)
		{
		case 'l':
		case 'L':System.out.println(ch + " is a letter");
					break;
		case 'w':
		case 'W':System.out.println(ch + " is a white space");
					break;
		case 'd':
		case 'D':System.out.println(ch + " is a Digit");
					break;
		
		case 's':
		case 'S':System.out.println(ch + " is a Special character");
					break;
		default:
				System.out.println(ch + "is not a letter, digit, space or special character");
		System.out.println("End os program");
		}
	}

}
