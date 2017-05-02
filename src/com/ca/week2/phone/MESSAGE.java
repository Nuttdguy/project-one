package com.ca.week2.phone;

public enum MESSAGE {

	ADDRECORD("Add new record\n1. First name\n2. Middle name\n3. Last name\n4. Phone number\n5. City\n6. State"),
	ADDSUCCESS("Record was successfully added");
	
	private String message;
	
	MESSAGE(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message.toString();
	}
}
