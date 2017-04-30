package com.ca.week1.fri;

import java.util.Scanner;

public class Challenge4 {

	//  Write a program to display first non repeated character of a string then the repeating characters. 
	//  E.g. input morning should display morignn.
	static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter a word or phrase; and all repeating characters will be appended to end. ");
		System.out.println("The word re-arranged :  ... " + appendRepeatingCharactersOntoEnd( getInput() ));
		
		sc.close();
	}
	
	private static String getInput() {
		return sc.nextLine();
	}
	
	private static String appendRepeatingCharactersOntoEnd(String input) {
		String inputCopy = input;
		String duplicates = "";
		
		//  We need to find all duplicates characters
		//  1. Track character occurrence counter; if > 0, continue through loop
		for (int mainIdx = 0; mainIdx < inputCopy.length(); mainIdx++ ) {
			String toCompare = input.substring(mainIdx, mainIdx+1);
			
			int inCounter = 0;
			for (int inIdx = 1; inIdx < input.length(); inIdx++ ) {
				String s = input.substring(inIdx, inIdx+1);		
				// check if character is == to compare, if > 0, replace with ""
				// AND add character to duplicates * number of occurrences
				
				if (toCompare.equals(s)) {
					if (inCounter == 0) {
						inCounter++;
					} else {
						inputCopy = inputCopy.replace(toCompare, "");
						for (int x = 0; x <= inCounter; x++ ) {
							duplicates += toCompare;
						}
					}
				}			
			}
		}
		
		return inputCopy + duplicates;
	}

}
