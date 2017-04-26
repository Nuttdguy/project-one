package com.ca.week1.wed;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge3 {

	//	Write a method to prompt the user for a number 
	// then display check if the number is Even or Odd.
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int number;
		
		try {
			System.out.println("Enter a number to check if it is even or odd.");
			number = getNumberToCheck();
			
			System.out.println("The result of your number is ... " + evenOrOdd( number ));
			
		} catch (InputMismatchException iex) {
			System.out.println("You were suppose to enter a number.");
		} catch (IllegalFormatConversionException cex) {
			System.out.println("Sorry, unable to convert number successfully.");
		} finally {
			sc.close();
		}
		
	}

	private static int getNumberToCheck() throws InputMismatchException, IllegalFormatConversionException {
		return sc.nextInt();
	}
	
	private static String evenOrOdd(int number) {
		return (number % 2) == 0 ? "even." : "odd.";
	}

}
