package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge4 {

	//  Write a program to remove the middle character of a string. 
	//  eg input "stack" output:"stck", input "banana" output: "bana" 
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter a word/phrase; remove the middle character. ");
		System.out.println("The word/phrase with the middle character removed ... " + removeTheMiddleCharacter( getInput() ));
		
	}

	private static String getInput() {
		return sc.nextLine();
	}
	
	private static String removeTheMiddleCharacter(String input) {
		StringBuilder modifiedInput = new StringBuilder();
		
		if (input.length() % 2 == 0 ) {
			modifiedInput.append(input.substring(0, (input.length() / 2)-1) );
			modifiedInput.append(input.substring( (input.length() / 2)+1) );
		} else {
			modifiedInput.append(input.substring(0, (input.length() / 2)) );
			modifiedInput.append(input.substring( (input.length() / 2)+1) );
		}
		
		return modifiedInput.toString();
	}
}
