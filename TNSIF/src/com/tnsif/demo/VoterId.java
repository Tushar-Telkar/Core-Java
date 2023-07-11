package com.tnsif.demo;

public class VoterId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=25;
		boolean nationality=true;
		
		if(nationality)
		{
			if(age>=18)
			{
				System.out.println("Person is an Indian and is eligible to vote");
			}
			else
			{
				System.out.println("Person is an Indian and but not eligible to vote");
			}
		}
		else
		{
			System.out.println("Person is not an Indian so not eligible");
		}
	}

}
