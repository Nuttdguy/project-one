package com.ca.week2.wed;

public class Branch {

	private String alias;
	private String region;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Branch(String alias, String region, String address, String city, String state, String zip) {
		this.alias = alias;
		this.region = region;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return alias + " - " + region + " - " + address + " - " + city + " - " + state + " - " + zip;
	}
	
	
	
}
