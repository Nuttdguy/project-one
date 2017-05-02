package com.ca.week2.phone;

public enum MENU {

	ADD_NEW_RECORD("Add new record: "),
	ADD_FIRST_NAME("Add first name: "),
	ADD_MIDDLE_NAME("Add middle name: "),
	ADD_LAST_NAME("Add last name: "),
	ADD_CITY("Add city: "),
	ADD_STATE("Add state: "),
	ADD_NUMBER("Add number: ");
	
	private String selection;
	
	MENU(String selection) {
		this.selection = selection;
	}
	
	public String getMenuParam() {
		return this.selection;
	}
	
}
