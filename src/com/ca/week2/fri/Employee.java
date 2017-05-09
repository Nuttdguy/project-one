package com.ca.week2.fri;

public class Employee extends Person implements Bills {

	@Override
	public double taxes(double amount) {
		return amount * .20;
	}

	@Override
	public double calculateTelephoneBill(double amount) {
		return this.taxes(amount) + amount;
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
