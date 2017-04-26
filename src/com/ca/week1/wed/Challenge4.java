package com.ca.week1.wed;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge4 {

	//	Write a method to prompt the user for an Integer then display the same value  
	//	with one decimal place. eg user enter "15 " result is: "You entered 15, the new value is 15.0".
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int number;
		
		try {
			System.out.println("Lets turn your integer choice into a double.");
			number = getInteger();
			
			System.out.println( String.format("Your integer as a double is ... %.1f",(double) number ));
			
		} catch (InputMismatchException iex) {
			System.out.println("You were suppose to enter a number.");
		} catch (IllegalFormatConversionException fex) {
			System.out.println("Opps, there was a mistake in the code. ");
		} finally {
			sc.close();
		}
		
	}

	private static int getInteger() {
		return sc.nextInt();
	}

}
