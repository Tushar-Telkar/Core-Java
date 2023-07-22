package com.tnsif.hierarchical;

//child 1 class
public class Employee extends Person{

	//data members
	private int empid;
	private String companyName;
	private String designation;
	private float salary;
	
	//default constructor	
	public Employee() {
		System.out.println("Employee constructor");
	}
	
	//parameterized constructor
	public Employee(String name, String city, int age,int empid, String companyNamel, String designation, float salary) {
		super(name, city, age);
		this.empid = empid;
		this.companyName = companyNamel;
		this.designation = designation;
		this.salary = salary;
	}
	//getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyNamel) {
		this.companyName = companyNamel;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	//to string method
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", companyName=" + companyName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
		
}
