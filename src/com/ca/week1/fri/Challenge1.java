package com.ca.week1.fri;

import java.util.Scanner;

public class Challenge1 {
	
	//  Write a method to remove a given character from a string. 
	//  E.g. remove all 'a' from Averange should return vernge
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter a word or phrase to remove character from ... ");
		String thePhrase = getInput();
		System.out.println("Which character do you want to remove from the word or phrase ...");
		String charToRemove = getInput();
		
		System.out.println("The word / phrase with character removed ....  " + removeTheCharacterFromPhrase(thePhrase, charToRemove));
	}

	private static String getInput() {
		return sc.nextLine();
	}

	private static String removeTheCharacterFromPhrase(String thePhrase, String charToRemove) {
		StringBuilder modifiedPhrase = new StringBuilder();
		
		for (char c = 0; c < thePhrase.length(); c++) {
			if (thePhrase.charAt(c) != charToRemove.charAt(0) ) {
				modifiedPhrase.append( thePhrase.charAt(c) );
			}
		}
		
		return modifiedPhrase.toString();
	}
	
}







