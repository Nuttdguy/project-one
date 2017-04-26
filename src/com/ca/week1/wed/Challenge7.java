package com.ca.week1.wed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge7 {

	// Write a method to prompt the user for 4 digits representing a year.
	// Then determine If Year Is a Leap Year.
	// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int year;
		boolean result;
		
		try {
			System.out.println("Check if the year is a leap year.");
			year = getYear();
			result = isLeapYear( year  );
			System.out.println( displayResult(result, year) );
		} catch (InputMismatchException mex) {
			System.out.println("You were suppose to enter a number ...");
		} catch (NumberFormatException nex) {
			System.out.println("You did not enter a valid year ...");
		} finally {
			sc.close();
		}

	}

	private static int getYear() throws InputMismatchException, NumberFormatException {
		String year = sc.nextLine();
		return (isValidYear(year)) ? Integer.parseInt(year) : -1;
	}

	private static boolean isValidYear(String year)  {
		return year.length() == 4 ? true : false;
	}
	
	private static boolean isLeapYear(int year) {
		boolean result = false;
		if (year % 4 == 0 && year != 0) {
			if (year % 100 == 0 && year % 400 == 0) {
				return true;
			}
		} 
		return result;
	}
	
	private static String displayResult(boolean result, int year) {
		if (result == true && year > 0 && year < 10000 )
			return year + " is a leap year!";
		else if ( result == false && year > 0 && year < 10000)
			return year + " is not a leap year ...";
		else if (year > 10000 )
			return "The year " + year + " is not valid ... ";
		else 
			return "The year could not be determined ...";
	}
}
