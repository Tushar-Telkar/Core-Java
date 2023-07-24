package com.tnsif.interfacedemo;

//entity class
public class Customer {
	private String name;
	private String city;
	
	public Customer() {
		super();
	}
	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
