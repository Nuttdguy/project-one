package com.ca.week2.tues;

import static com.ca.week2.tues.Student.StudentBuilder;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new StudentBuilder()
											.addFirstName("Phouthalang")
											.addLastName("Pygnasak")
											.addAge(37)
											.addStreet("1223 Hopkin Ave.")
											.addCity("St. Louis")
											.addState("Missouri")
											.addZip(55533)
											.build();
									
		System.out.println(
								   student1.getFirstName() 
						+ "  || " + student1.getLastName() 
						+ "  || " + student1.getAge()
						+ "  || " + student1.getGender()
						+ ", " + student1.getStreet()
						+ ", " + student1.getCity()
						+ ", " + student1.getState()
						+ ", " + student1.getZip());
		
		System.out.println(student1);
	}

}
