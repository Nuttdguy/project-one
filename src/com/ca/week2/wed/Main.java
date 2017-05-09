package com.ca.week2.wed;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//  Book functions:
		//  1. Create a book(s)
		List<Book> bkList = new ArrayList<>();
		Book book1 = new Book("Author-01", "Book-01", 1111, 200, "Fantasy", true);
		Book book2 = new Book("Author-02", "Book-02", 2222, 300, "Action", true);
		Book book3 = new Book("Author-03", "Book-03", 3333, 400, "Horror", true);
		Book book4 = new Book("Author-04", "Book-04", 4444, 500, "Fantasy", true);
		bkList.add(book1); bkList.add(book2); bkList.add(book3); bkList.add(book4);
		
		//  Branch functions:
		Branch branch1 = new Branch("North1", "1234 St. Louis Co", "Louis Street", "St. Louis", "MO", "55234");
		
		//  Customer functions:
		List<Customer> csList = new ArrayList<>();
		Customer c1 = new Customer("Harry", "Larry", "F");
		Customer c2 = new Customer("Joe", "Sum", "K");
		Customer c3 = new Customer("Mary", "Long", "L");
		Customer c4 = new Customer("Susan", "Soleil", "C");
		csList.add(c1); csList.add(c2); csList.add(c3); csList.add(c4);
		
		//  Library functions:
		//  1. Add book(s) to library catalog
		//  2. Add Customer
		//  3. Checkout book(s)
		//  4. Add Branch
		Library library1 = new Library();
		
		List<Integer> checkSize = new ArrayList<>();
		library1.setCustomers(csList);
		library1.setBranches(branch1);
		library1.setBooks(bkList);
		
		// Requirement - Methods
		// Get total book count in a "Library"
		System.out.println("Total # of books:  " + library1.totalBooks());
		
		//  Get branch details of a "Library"
		System.out.println("\nLibrary branch:\n" + library1.getBranch());
		
		//  Add customer to a "Library"
		System.out.println("\nAdding new customer:\n" + library1.addCustomer(c1));
		
		//  Print out customer name and all books
		//  check out book 
		c1.setBooksOut(book1);
		c1.setBooksOut(book2);
		System.out.println("\nThe customer is:\n" + c1.printCustomerDetails() + "\n\nChecked out books:" + c1.printBooksOut() );
			
		//====||  THURSDAY REQUIREMENT  ||====\\
		//  Add single record Customer Object to CustomerProfile Object
		library1.addCustomerProfile(c1);
		
		//  Add single record Book Object to BookLog Object
		library1.addToBookLog(book1);
		
	}

}
