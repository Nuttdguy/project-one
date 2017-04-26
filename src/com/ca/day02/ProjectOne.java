package com.ca.day02;

import java.util.Scanner;

public class ProjectOne {

	static Scanner sc;
	
	public static void main(String[] args) {	
		
		sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		
		int userNum = sc.nextInt();
		System.out.println("This is the result of the square: " + square(userNum));
		sc.close();
	}

	public static int square(int value) {
		return value * value;
	}
	
}
