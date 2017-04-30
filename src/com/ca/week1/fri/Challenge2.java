package com.ca.week1.fri;

import java.util.Scanner;

public class Challenge2 {
	// Write a method to remove duplicate characters from a string.

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter a word or phrase to remove duplicate characters ... ");
		System.out.println("Your new word / phrase with duplicate characters removed ... "
				+ removeDuplicateCharacters(getInput()));
	}

	private static String getInput() {
		return sc.nextLine();
	}

	private static String removeDuplicateCharacters(String input) {
		String inputCopy= input;

		for (int mainIdx = 0; mainIdx < inputCopy.length(); mainIdx++) {
			// System.out.println("mainIdx ==  " + mainIdx); // Loops through all characters successfully
			// 1. Store the current String character
			String currentChar = inputCopy.substring(mainIdx, mainIdx +1);
			
			// 4. In addition to #3; add loop to count number of letter occurrences. 
			// then use that number less 1 to prevent removal of two of same letter, e.g. try "Mississippi"
			int count = 0;
			for (int inIdx = 1; inIdx < input.length(); inIdx++) {
				// System.out.println("mainIdx :   " + mainIdx + "  ||  inIdx :   "  + inIdx);  //  Loops through each character of the input
				
				// We want all the duplicates, besides one removed
				// 2. Store the second String character to compare  
				String innerChar = input.substring(inIdx, inIdx + 1);
				
				// use replace and extract duplicate character assign to new String Copy
				if (currentChar.equals( innerChar ) ) {
					// 3. add count, if logic to prevent first occurence from being deleted
					if (count == 0 ) {
						// increment count; continue with current iteration
						count++;
					} else {
						// if the same, remove/replace the character from the current position
						inputCopy = inputCopy.replaceFirst(innerChar, "");  //(innerChar, "");
						break;
					}
				}
			}
		}
		
		return inputCopy;
	}
}
