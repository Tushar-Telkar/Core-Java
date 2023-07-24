package com.tnsif.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Tushar","Ballari",1000,40000);
		System.out.println(s1);
		
		s1.deposite(20000);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);
	}

}
