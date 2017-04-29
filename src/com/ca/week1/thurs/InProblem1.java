package com.ca.week1.thurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InProblem1 {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Write a word or sentence to check.");
		String input = sc.nextLine();
		
		System.out.println("Enter the letter in which you want to check the number of occurences.");
		String letterToCount = sc.next();
		
		System.out.println("The number of letter occurences : " + countTheNumberOfOccurences(input, letterToCount.charAt(0)) );	
		System.out.println("Sentence without white space : " + removeWhiteSpaceFromSentence(input) );
		List<String> duplicateLetters = findDuplicateCharacters(input);
		for (String s : duplicateLetters ) {
			System.out.println("Duplicate letter: " + s);
		}
		
	}

	private static int countTheNumberOfOccurences(String input, char letterToCount ) {
		int count = 0;
		for ( int i = 0; i < input.length(); i++ ) {
			if (input.charAt(i) == letterToCount) {
				count++;
			}
		}
		return count;
	}
	
	private static String removeWhiteSpaceFromSentence(String input) {
		String withoutWhiteSpace = "";
		START: for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				continue START;
			} else {
				withoutWhiteSpace += input.charAt(i);
			}
		}
		return withoutWhiteSpace;
	}

	private static List<String> findDuplicateCharacters(String input) {
		List<String> duplicateChars = new ArrayList<>();
		char[] inputCopy = input.toCharArray();
		int k =  inputCopy.length-1;
		//  Get the length of the passed in sentence
		for (int i = 0; i < input.length(); i++) {
			//  Get the first character of the string with "i"
			char iChar = input.charAt(i);
			
			//  Loop through each character of a copy of passed in sentence
			for (k = inputCopy.length-1 ; k > 0; k-- ) {
				// Store char to compare
				char kChar = inputCopy[k];
				if (iChar == kChar) {
					//  Convert char to string and add to arrayList
					duplicateChars.add(String.valueOf(kChar));
					
					//  Remove char of specific index from char array;
					//  Reconstruct first part of sentence
					String firstPart = input.substring(0, k);
					// Reconstruct second part of sentence
					String secondPart = input.substring(k+1);
					//  Reconstruct Parts, convert into char array
					inputCopy = (firstPart + secondPart).toCharArray();
					// inputCopy = String.valueOf(inputCopy).substring(inputCopy.length - k, inputCopy.length).toCharArray();
					break;
				}
				
			}
		}
		return duplicateChars;
		
	}
	
}
