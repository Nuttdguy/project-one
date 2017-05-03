package com.ca.week2.tues;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private boolean isScienceMajor = false;
	private char gender = '\u0000';
	private Address address;
	
	public Student() {
		this(null, null, 0);
	}
	
	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}	
	
	public Student(StudentBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.isScienceMajor = builder.isScienceMajor;
		this.gender = builder.gender;
		this.address = builder.address;
		this.address.setStreet(builder.address.getStreet());
		this.address.setCity(builder.address.getCity());
		this.address.setState(builder.address.getState());
		this.address.setZip(builder.address.getZip());
	}
	
	protected static class StudentBuilder {
		private String firstName;
		private String lastName;
		private int age;
		private boolean isScienceMajor = false;
		private char gender = '\u0000';
		private Address address;
		
		protected StudentBuilder() {
			this.address = new Address();
		}
		
		protected StudentBuilder addFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		protected StudentBuilder addLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		protected StudentBuilder addAge(int age) {
			this.age = age;
			return this;
		}
		
		protected StudentBuilder addStreet(String address) {
			this.address.setStreet(address);
			return this;
		}
		
		protected StudentBuilder addCity(String city) {
			this.address.setCity(city);
			return this;
		}
		
		protected StudentBuilder addZip(int zip) {
			this.address.setZip(zip);
			return this;
		}
		
		protected StudentBuilder addState(String state) {
			this.address.setState(state);
			return this;
		}
		
		protected Student build() {
			return new Student(this);
		}
		
	}
	

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isScienceMajor() {
		return isScienceMajor;
	}

	public void setScienceMajor(boolean isScienceMajor) {
		this.isScienceMajor = isScienceMajor;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getStreet() {
		return this.address.getStreet();
	}
	
	public String getCity() {
		return this.address.getCity();
	}
	
	public String getState() {
		return this.address.getState();
	}
	
	public int getZip() {
		return this.address.getZip();
	}

	@Override
	public String toString() {
		return firstName + " - " + lastName + " - " + age + " - " + isScienceMajor + " - " + gender 
				+ " - " + address.getState() + " - " + address.getCity() + " - " + address.getStreet();
	}
	
	
	
}
