package com.ca.week1.wed;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge5 {

	// Write a method to prompt the user for a letter
	// of the alphabet and display it's numerical value.
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int input;

		try {
			System.out.println("Enter a character and convert it into ASCII.");
			
			input = getNextCharacter();
			System.out.println( String.format("ASCII value of character is  ...  %d", input) );
			
		} catch (IllegalFormatConversionException iex) {
			System.out.println("Opps, something went wrong with the code.");
		} catch (InputMismatchException mex) {
			System.out.println("You were suppose to enter a letter");
		} finally {
			sc.close();
		}

	}

	private static char getNextCharacter() {
		String nextCharacter = sc.next();
		return nextCharacter.charAt(0);
	}

}
