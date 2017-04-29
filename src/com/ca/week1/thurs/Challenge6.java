package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge6 {

	// Write a program to count all the vowels in a string.  eg input"banana" output:3
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter to word or phrase to count the number of vowels.");
		System.out.println("The word / phrase has ... " + countNumberOfVowels( getInput() )   +  " vowels. ");
	}

	private static String getInput() {
		return sc.nextLine();
	}


	private static int countNumberOfVowels(String input) {
		char[] charArr = {'a', 'e', 'i', 'o', 'u'};
		int vowelCount = 0;
		
		for (char c : input.toCharArray() ) {
			for (char k : charArr ) {
				if (c == k ) {
					vowelCount++;
				}
			}
		}	
		return vowelCount;
	}

}
