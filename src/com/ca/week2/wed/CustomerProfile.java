package com.ca.week2.wed;

import java.util.Arrays;

public class CustomerProfile {

	private Customer customer;
	private BookLog[] bookLog;
	
	public CustomerProfile() {
		this.bookLog = new BookLog[1];
	}

	public CustomerProfile addCustomer(Customer customer ) {
		this.customer = customer;
		return this;
	}
	
	public CustomerProfile addBookToLog(Book book) {
		BookLog[] log = new BookLog[bookLog.length + 1];
		
		BookLog blog = new BookLog();
		log[bookLog.length] = blog.addBook(book);
		return this;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BookLog[] getBookLog() {
		return bookLog;
	}

	public void setBookLog(BookLog[] bookLog) {
		this.bookLog = bookLog;
	}

	@Override
	public String toString() {
		return customer.getFirstName() + " - " + Arrays.toString(bookLog);
	}

}
