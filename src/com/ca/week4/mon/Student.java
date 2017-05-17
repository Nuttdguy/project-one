package com.ca.week4.mon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private double gpa;
	private Address address;
	private String filePath = "H:\\\\CA\\";
	
	public Student() {
		// default constructor	
	}
	
	public Student(String email) {
		this.email = email;
		this.address = new Address();
	}
	
	public void writeToFile() {	
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + this.email + ".txt" ))) {
			String content = this.toString();
			bw.write(content);
			System.out.println("Done");
		} catch (IOException ex) {
			ex.printStackTrace();
		}	
		
	}
	
	public void readFile() {
		
		try ( BufferedReader br = new BufferedReader(new FileReader( filePath + this.email + ".txt" ) ) ) {
			String s = br.readLine();
			String[] stuArr = s.split(" -");
			
//			if (this.address == null) {
//				this.address = new Address();
//			}
		
			for (int i = 0; i < stuArr.length; i++) {
				if (i == 0)
					this.firstName = stuArr[i].trim();
				if (i == 1)
					this.lastName = stuArr[i].trim();
				if (i == 3)
					this.age = Integer.parseInt( stuArr[i].trim() );
				if (i == 4)
					this.gpa = Double.parseDouble( stuArr[i].trim() );
				if (i == 5)
					this.address.setStreet(stuArr[i]);
				if (i == 6)
					this.address.setCity(stuArr[i]);
				if (i == 7)
					this.address.setState(stuArr[i]);
				if (i == 8)
					this.address.setZip(stuArr[i]);
				
			}

			System.out.println(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	

	public Student(String firstName, String lastName, String email, int age, double gpa, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.gpa = gpa;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return firstName + " - " + lastName + " - " + email + " - " + age + " - " + gpa + " - " + address.getStreet() + " - " + address.getCity() + " - " + address.getState() + " - " + address.getZip();
	}

	
}
