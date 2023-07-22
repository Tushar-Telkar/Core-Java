package com.tnsif.inheritance;

public class Citizen {
	//data members
	private String name;
	private int id;
	private String address;
	private int age;
	private String BirthPlace;
	
	//default constructor
	public Citizen() {
		System.out.println("citizen object created");
	}

	//parameterized constructor	
	public Citizen(String name, int id, String address, int age, String birthPlace) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.age = age;
		BirthPlace = birthPlace;
	}

	//getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBirthPlace() {
		return BirthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		BirthPlace = birthPlace;
	}

	//to string method
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + ", BirthPlace="
				+ BirthPlace + "]";
	}

}
