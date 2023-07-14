package com.tnsif.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name ");
		String name=sc.next();
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		System.out.println("Enter Gender ");
		String gender=sc.next();
		System.out.println("Enter Income ");
		int income=sc.nextInt();
		
		Person person1=new Person();
		
		person1.setName(name);
		person1.setAge(age);
		person1.setGender(gender);
		person1.setIncome(income);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person1);
		System.out.println(person1);
		sc.close();
	}

}
