package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge5 {

	// Write a program to determine if a string is a palindrome. eg. refer deed
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter a word or phrase to determine whether it's a palindrome.");
		System.out.println("Is your word/phrase a palindrome ... " + isPalindrome( getInput() ));
	}

	private static String getInput() {
		return sc.nextLine();
	}
	
	private static boolean isPalindrome(String input) {
		String reversedInput = "";
		for (int idx = input.length(); idx > 0; idx-- ) {
			reversedInput += input.charAt(idx-1);
		}
		return input.equals(reversedInput);
	}
	
}
