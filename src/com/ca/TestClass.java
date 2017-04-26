package com.ca;

import java.io.IOException;
import java.util.Scanner;

public class TestClass {
	
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		// declare variables
		String name = null;
		int age = 0;
		
		// get name and age
		name = getName();
		try {
			age = getAge();
		} catch (IOException io) {
			io.printStackTrace();
		} catch (Exception ex) {
			System.out.println("\nYou broke it silly. You were suppose to enter a number.");
		}
		
		// display Hi<user>
		System.out.println("Hi, " + name);
		
		// age after 5 yrs, age before 5 yrs
		System.out.println( displayAge( age) );
		sc.close();
		
	}

	private static String getName() {
		System.out.println("Please enter your name: ");
		return sc.nextLine();
	}
	
	private static int getAge() throws Exception {
		System.out.println("Please enter your age: ");
		return sc.nextInt();
	}
	
	private static String displayAge(int age) {
		return String.format("In 5 years, you will be %d.\n5 years ago, you were %d years old.", age + 5, age - 5);
	}

}
