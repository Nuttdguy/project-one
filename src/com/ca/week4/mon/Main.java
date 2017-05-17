package com.ca.week4.mon;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("pygnasak@gmail.com");
		s1.setFirstName("Phouthalang");
		s1.setLastName("Pygnasak");
		s1.setAge(37);
		s1.setGpa(3.2);
		Address a1 = new Address();
		a1.setCity("Maple Grove");
		a1.setState("city");
		a1.setStreet("9294 Holly Ln");
		a1.setZip("55670");
		s1.setAddress(a1);
		
		s1.writeToFile();
		
		Student s2 = new Student(s1.getEmail());
		System.out.println(s2);
		
		s2.readFile();
		
		
	}

}
