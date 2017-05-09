package com.ca.week2.fri;

public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		double telephoneBill = s1.calculateTelephoneBill(120.5);
		double emTelephoneBill = e1.calculateTelephoneBill(120.5);
		
		System.out.println("Student: " + telephoneBill + "\nEmployee: " + emTelephoneBill);
		
		Person p1 = new Student();
		Person pe1 = new Employee();
		
		System.out.println("Student: " + p1.calculateTelephoneBill(120.5) + "\nEmployee: " + pe1.calculateTelephoneBill(120.5) );
		
		s1.firstName = "Henry";
		e1.firstName = "Sara";
		
		s1.getAddress().setCity("City");
		
		p1.firstName = "Jeremy";
		pe1.firstName = "Mai";
		
		
		System.out.println(p1.toString());
		System.out.println(pe1.toString());
		
		System.out.println(p1.calculateOtherBill(120.5));
		System.out.println(pe1.calculateOtherBill(120.5));
		
		
		School studentList = new School();
		studentList.students.add(s1);
		studentList.students.add((Student)p1);
		
		School employeeList = new School();
		employeeList.employees.add(e1);
		employeeList.employees.add((Employee)pe1);
		
		
		
		
	}

}
