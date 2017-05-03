package com.ca.week2.phone;

public class Record {

	private String firstName;
	private String lastName;
	private String middleName;
	private String city;
	private String state;
	private String number;
	private String zip;
	
	//==||  Constructor  ||==||
	public Record() {
		
	}
	
	public Record(RecordBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.middleName = builder.middleName;
		this.city = builder.city;
		this.state = builder.state;
		this.number = builder.number;
		this.zip = builder.zip;
	}
	
	//==||  Builder  ||==||
	protected static class RecordBuilder {
			
		private String firstName;
		private String lastName;
		private String middleName;
		private String city;
		private String state;
		private String number;
		private String zip;
		
		
		protected RecordBuilder() {
			
		}
		
		protected RecordBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		protected RecordBuilder addFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		protected RecordBuilder addLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		protected RecordBuilder addMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		protected RecordBuilder addCity(String city) {
			this.city = city;
			return this;
		}
		
		protected RecordBuilder addState(String state) {
			this.state = state;
			return this;
		}
		
		protected RecordBuilder addNumber(String number) {
			this.number = number;
			return this;
		}
		
		protected RecordBuilder addZip(String zip) {
			this.zip = zip;
			return this;
		}
		
		protected Record build() {
			return new Record(this);
		}
		
	}
	
	
	//==||  Basic Getters & Setters  ||==||
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
