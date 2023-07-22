package com.tnsif.inheritance;

//child class
public class Student extends Citizen{
	//data members
	private int uid;
	private String collegename;
	private String branch;
	
	//default constructor
	public Student() {
		System.out.println("student object created");
		
	}
	
	//parameterized constructor	
	public Student(String name, int id, String address, int age, String birthPlace,int uid, String collegename, String branch) {
		super(name,id, address,age,birthPlace);
		this.uid = uid;
		this.collegename = collegename;
		this.branch = branch;
	}

	//getters and setters
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	//to string method
		@Override
		public String toString() {
			return "Student [uid=" + uid + ", collegename=" + collegename + ", branch=" + branch + ", getName()="
					+ getName() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
					+ ", getBirthPlace()=" + getBirthPlace() + "]";
		}
	
	

}
