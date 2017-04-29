package com.ca.week1.thurs;

import java.util.Scanner;

public class Challenge2 {

	// Write a program to convert every even position to upper case and every odd position to lower case. 
	// eg input "Banana" output :"bAnAnA" or input "StLouis" output:"sTlOuIs"
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a word or phrase to rearrange. ");
		System.out.println("Your word/phrase rearranged ... " + arrangeCharEvenToUpperOddToLower( getInput() ));
		
	}

	private static String getInput() {
		return sc.nextLine();
	}

	private static String arrangeCharEvenToUpperOddToLower(String input) {
		char[] charArr = input.toCharArray();
		StringBuilder builder = new StringBuilder();
		
		for ( int i = 0; i < charArr.length; i++ ) {
			if ( i % 2 == 0) {
				builder.append( String.valueOf( charArr[i]).toUpperCase() );
			} else {
				builder.append( String.valueOf( charArr[i]).toLowerCase() );
			}
		}
		return builder.toString();
	}

}
