package com.ca.week1.wed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge6 {

	//	Write a method to prompt the user for a double then display the 
	//	value as a whole number. eg user enter "15 .8" result is:  "You entered 15.8, the new value is 16".
	//  eg user enter "15 .4" result is:  "You entered 15.4, the new value is 15".
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double number;
		
		try {
			System.out.println("Enter a double to roundup or down");
			number = getDoubleFromInput();
			
			System.out.println("Your number rounded to nearest is ... " + roundDouble(number, 1) );
		} catch(InputMismatchException mex) {
			System.out.println("You were suppose to enter a number.");
		} finally {
			sc.close();
		}
		
	}

	public static double getDoubleFromInput( ) throws InputMismatchException {
		return sc.nextDouble();
	}
	
	private static int roundDouble(double number, double toRound) {
		return (int)Math.round(number / toRound);
	}
}
