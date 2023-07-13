package com.tnsif.constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object1 and calling default constructor
		ConstructorCustomer cc1=new ConstructorCustomer(); 
		System.out.println(cc1);
		 
		//creating object2 and calling parameterized constructor
		ConstructorCustomer cc2=new ConstructorCustomer(2,"Vikas",1231231231);
		System.out.println(cc2);
	}

}
