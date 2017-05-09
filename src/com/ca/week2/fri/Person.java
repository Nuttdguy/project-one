package com.ca.week2.fri;

public abstract class Person {

	protected String firstName;
	protected String lastName;

	public abstract double taxes(double amount);
	public abstract double calculateTelephoneBill(double amount);
	public abstract double calculateOtherBill(double amount);

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " - " + lastName;
	}

}
