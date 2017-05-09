package com.ca.week2.fri;


public class Student extends Person implements Bills {

	private Address address;

	public Student() {
	}

	public Address getAddress() {
		return this.address;
	}

	@Override
	public double taxes(double amount) {
		return amount * .02;
	}

	@Override
	public double calculateTelephoneBill(double amount) {
		return this.taxes(amount) * amount;
	}

	@Override
	public double calculateOtherBill(double amount) {
		return this.taxes(amount) + amount;
	}

	@Override
	public double calculateGasBill(double amount) {
		return this.taxes(amount) - amount;
	}

	@Override
	public double calculateCarInsurance(double amount) {
		return this.taxes(amount) / 12;
	}

}
