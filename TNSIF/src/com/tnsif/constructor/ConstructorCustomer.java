package com.tnsif.constructor;

public class ConstructorCustomer {

	//private data members
	
	private int c_id;
	private String name;
	private long phNo;
	
	//default constructor
	public ConstructorCustomer()
	{
		c_id=1;
		name="Tushar";
		phNo=789456123;
	}
	
	//parameterized constructor
	public ConstructorCustomer(int c_id,String name,long phNo)
	{
		this.c_id=c_id;
		this.name=name;
		this.phNo=phNo;
	}

	//generating getters and setters
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	//generating tostring() method
	@Override
	public String toString() {
		return "ConstructorCustomer [c_id=" + c_id + ", name=" + name + ", phNo=" + phNo + "]";
	}
	
}
