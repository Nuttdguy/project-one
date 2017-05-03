package com.ca.week2.wed;

public class Book {

	private String author;
	private String title;
	private int isbn;
	private int numberOfPages;
	private String genre;
	private boolean checkedOut = false;

	public Book(String author, String title, int isbn, int numberOfPages, String genre, boolean checkedOut) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
		this.genre = genre;
		this.checkedOut = checkedOut;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return author + " - " + title + " - " + isbn + " - " + numberOfPages + " - " + genre + " - " + checkedOut;
	}

}
