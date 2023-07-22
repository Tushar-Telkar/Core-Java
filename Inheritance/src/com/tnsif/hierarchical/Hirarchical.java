package com.tnsif.hierarchical;

public class Hirarchical {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("person class details...");
		System.out.println(p);
		
		//dynamic binding//runtime polymorphism//loose coupling
		Person p1; //object reference
		p1=new Person("venu","Bidar",24);
		
		if(p1 instanceof Person) {
		System.out.println(p1);
		}
		p1=new Employee("ganesh","gadag",22,100,"TNS","Developer",500000);
		if(p1 instanceof Employee) {
		System.out.println(p1);
		}
		p1=new Student("Dilip","Banglore",21,007,"IT","XYZ");
		if(p1 instanceof Student) {
		System.out.println(p1);
		}
		
	}

}
