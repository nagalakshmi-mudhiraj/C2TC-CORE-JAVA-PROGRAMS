package com.tnsif.day;

public class Person {
	private  String name;
	private Address address;
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayInfo()
	{
		System.out.println(name);
		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getPostalCode());
		
}
	}

