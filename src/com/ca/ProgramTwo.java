package com.ca;

import java.util.Scanner;

public class ProgramTwo {

	static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int userNum = 0;
		
		try {
			System.out.println("Give me a number ... ");
			userNum = getUserNum();
		} catch (Exception ex) {
			System.out.println("OMG, you have to enter a number ... gee-wee.");
		}
		
		// check if user # is divisible by 3 or 5
		System.out.println( checkUserNumIsDivisible(userNum) );
	}

	private static int getUserNum() throws Exception {
		return sc.nextInt();
	}

	private static String checkUserNumIsDivisible(int userNum ) {
		return (userNum % 3 == 0 || userNum % 5 == 0) ? "Shizzy-Whizzy, you're number is divisible by 3 or 5." : "oh boy, it looks like your number is not divisible by 3 or 5.";
	}
}
