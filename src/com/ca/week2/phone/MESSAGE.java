package com.ca.week2.phone;

public enum MESSAGE {

	DISPLAYOPTION("What action would you like to perform: "),
	ADDSUCCESS("Record was successfully added");
	
	private String message;
	
	MESSAGE(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message.toString();
	}
}
