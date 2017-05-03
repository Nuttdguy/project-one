package com.ca.week2.wed;

public class BookCheckedOutException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static String CHECKED_OUT = "Sorry, book is already checked out.";
	
	public BookCheckedOutException() {
		
	}
	
}
