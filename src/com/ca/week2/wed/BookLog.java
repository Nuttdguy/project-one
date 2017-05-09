package com.ca.week2.wed;

import java.time.LocalDate;

public class BookLog {
	
	private Book book;
	private LocalDate checkOutDate;
	
	public LocalDate returnDate(LocalDate date) {
		return date;
	}
		
	public BookLog addBook(Book book) {
		this.book = book;
		return this;
	}
}
