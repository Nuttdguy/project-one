package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge1 {

	// Write a program to read an input and determine if a string has all unique
	// characters.

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Input a word or phrase: ");
		System.out.println("Does the word//phrase have all unique characters? " + isCharactersOfInputUnique(getInput()));
	}

	private static String getInput() {
		return sc.nextLine();
	}

	private static boolean isCharactersOfInputUnique(String input) {
		boolean isUnique = true;
		int idx = 1;
		
		for (char c : input.toCharArray()) {
			for (int x = idx; x < input.length() - 1; x++) {
				if (input.charAt(x) == c) {
					isUnique = false;
				}
			}
			idx++;
		}
		return isUnique;
	}
}
