package com.ca.week1.fri;

import java.util.Scanner;

public class Challenge3 {

	// Write a program to count the number of vowels and consonants in a string. 
	// E.g. if the input is Java the result should be 2 vowels and 2 consonants
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter a word to get the count for # of vowels and constants.");
		String input = getInput();
		System.out.println(String.format("Your word has %d vowels and %d constants", countTheVowels( input ), countTheConstants( input ) ) + ".");
		
		sc.close();
	}
	
	private static String getInput() {
		return sc.nextLine();
	}

	private static int countTheVowels(String input ) {
		int counter = 0;
		for (char c : input.toCharArray() ) {
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
				counter++;
			}
		}
		return counter;
	}
	
	private static int countTheConstants(String input ) {
		int counter = 0;
		for (char c : input.toCharArray() ) {
			if (c != 'a' || c != 'A' || c != 'e' || c != 'E' || c != 'i' || c != 'I' || c != 'o' || c != 'O' || c != 'u' || c != 'U') {
				counter++;
			}
		}
		return counter;
	}
	
}
