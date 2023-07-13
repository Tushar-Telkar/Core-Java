package com.tnsif.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int e_id;
		String e_name;
		long e_phno;
		double e_salary;
		
		System.out.println("Enter Employee id ");
		e_id=sc.nextInt();
		System.out.println("Enter Employee name ");
		e_name=sc.next();
		System.out.println("Enter Employee phone number ");
		e_phno=sc.nextLong();
		System.out.println("Enter Employee salary");
		e_salary=sc.nextDouble();
		
		System.out.println("Employee id="+e_id+"\nEmployee Name="+e_name+"\nEmployee phoneNumber="+e_phno+"\nEmployee Salary="+e_salary);
		sc.close();
	}

}
