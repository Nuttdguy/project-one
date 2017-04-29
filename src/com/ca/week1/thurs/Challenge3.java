package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge3 {

	// Write a program to reverse a word. eg input "Java" output "avaJ".
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter a word or phrase to reverse. ");
		System.out.println( reverseThePhrase( getInput() ) );
		
	}

	private static String getInput() {
		return sc.nextLine();
	}

	private static String reverseThePhrase(String input) {
		char[] charArr = new char[input.length()];
		int idx = 0;
		for ( int i = input.length(); i > 0; i-- ) {
			charArr[idx] = input.charAt(i-1);
			idx++;
		}
		return String.valueOf(charArr);
	}

}
