package com.ca.week2.tues;

public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address() {
		this(null, null, null, 0);
	}
	
	public Address(String street, String city, String state, int zip) {
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
