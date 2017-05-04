package com.ca.week2.wed;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// add library name
	private List<Book> books;
	private Branch branch;
	private List<Customer> customers;
	
	public Library() {
		this.books = new ArrayList<>();
		this.customers = new ArrayList<>();
	}
	
	// return the total amount of books in Library
	public int totalBooks() {
		return books.size();
	}
	
	// add customer to library 
	public String addCustomer(Customer customer) {
		customers.add(customer);
		return customer.toString();
	}
		
	// check out book
	public boolean checkBookOut(Book book, Customer firstName) {
		boolean flag = false;
		if (!book.isCheckedOut()) {
			// locate customer by name
			try {
				if (!firstName.getFirstName().isEmpty()) {
					books = new ArrayList<>();
					books.add(book);
					firstName.setBooksOut(book);
					flag = true;
				} else {
					throw new CustomerNotFoundException();
				}
			} catch (CustomerNotFoundException csex) {
				csex.getMessage();
			}
		} else {
			flag = false;  // Create BookCheckedOut Exception
		}
		return flag;
	}
	
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranches(Branch branch) {
		this.branch = branch;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
