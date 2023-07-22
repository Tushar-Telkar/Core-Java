package com.tnsif.hierarchical;

//child 2 class
public class Student extends Person{

	//data members
	private int rollno;
	private String branch;
	private String collegeName;
	
	//default constructor
	public Student() {
		System.out.println("student constructor");
	}


	//parameterized constructor
	public Student(String name, String city, int age,int rollno, String branch, String collegeName) {
		super(name, city, age);
		this.rollno = rollno;
		this.branch = branch;
		this.collegeName = collegeName;
	}

	//getters and setters
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	//to string method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", branch=" + branch + ", collegeName=" + collegeName + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
