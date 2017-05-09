package com.ca.week2.phone;

public enum MENU {

	ADD_NEW_RECORD("Add new record: "),
	SEARCH_FOR_RECORD("Search for record: "),
	SHOW_ALL_RECORDS("Show all record: "),
	UPDATE_RECORD("Update record: "),
	DELETE_RECORD("Delete record: "),
	EXIT_PROGRAM("Exit: "),
	
	ADD_FIRST_NAME("Add first name: "),
	ADD_MIDDLE_NAME("Add middle name: "),
	ADD_LAST_NAME("Add last name: "),
	ADD_CITY("Add city: "),
	ADD_STATE("Add state: "),
	ADD_NUMBER("Add number: "),
	ADD_ZIP("Add zip: "),
	
	UPDATE_FIRST_NAME("Update first name: "),
	UPDATE_MIDDLE_NAME("Update middle name: "),
	UPDATE_LAST_NAME("Update last name: "),
	UPDATE_CITY("Update city: "),
	UPDATE_STATE("Update state: "),
	UPDATE_NUMBER("Update number: "),
	UPDATE_ZIP("Update zip: "),
	
	SEARCH_BY_FIRST_NAME("Search by first name: "),
	SEARCH_BY_MIDDLE_NAME("Search by middle name: "),
	SEARCH_BY_LAST_NAME("Search by last name: "),
	SEARCH_BY_CITY("Search by city: "),
	SEARCH_BY_STATE("Search by state: "),
	SEARCH_BY_NUMBER("Search by number: "),
	SEARCH_BY_ZIP("Search by zip: ");
	
	
	private String selection;
	
	MENU(String selection) {
		this.selection = selection;
	}
	
	public String getString() {
		return this.selection;
	}
	
}
