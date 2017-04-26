package com.ca.week1.wed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge1 {
	
	//	Write a method to prompt the user to enter the radius of the circle
	//	 then calculate the area and circumference of the circle.

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double ofNumber = 0;

		System.out.println("Discover what the area and circumference of a circle is.");
		System.out.println("Enter the radius of the circle to calculate: " );
		
		try {
			ofNumber = getNumberToCalculate();
		} catch(InputMismatchException iex) {
			System.out.println("\nYou were suppose to enter a number.");
		} catch (Exception ex) {
			System.out.println("\nOpps, something went wrong.");
		} finally {
			sc.close();
		}
		
		System.out.println( "\nThe area of the number entered: is " + calculateArea(ofNumber) );
		System.out.println("The circumference of the number entered is: " + calculateCircumference(ofNumber));
		
	}

	private static double getNumberToCalculate() {
		return sc.nextDouble();
	}
	
	private static double calculateArea(double ofNumber) {
		return Math.PI  * (ofNumber * ofNumber);
	}

	private static double calculateCircumference(double ofNumber) {
		return (Math.PI  * 2) * ofNumber ;
	}
	
}
