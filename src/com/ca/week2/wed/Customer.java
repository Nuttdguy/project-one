package com.ca.week2.wed;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer  {

	private String firstName;
	private String lastName;
	private String middleName;
	private LocalDate enrollDate;
	private List<Book> booksOut;
	private boolean isActive = true;
	
	public Customer() { }
	
	public Customer(String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.enrollDate = LocalDate.now();
		this.booksOut = new ArrayList<>();
	}
	
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public LocalDate getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(LocalDate enrollDate) {
		this.enrollDate = enrollDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Book> getBooksOut() {
		return booksOut;
	}
	
	public String printBooksOut() {
		String s = "";
		for (Book b : booksOut) {
			s += "\n" + b.toString();
		}
		return s;
	}

	public void setBooksOut(Book booksOut) {
		this.booksOut.add(booksOut);
	}
	
	public String printCustomerDetails() {
		return firstName + " - " + lastName + " - " + middleName + " - " + enrollDate + " - "
				+ isActive;
	}

	@Override
	public String toString() {
		return firstName + " - " + lastName + " - " + middleName + " - " + enrollDate + " - " + printBooksOut() + " - "
				+ isActive;
	}

	
}
