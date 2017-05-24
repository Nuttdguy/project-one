package com.ca.week1.change;

import java.util.Scanner;

public class checker {

	/*
	you have to give someone change 
	what coins do you give that person? 

	Requirements: 
	takes user input 
	displays the change breakdown as output

	1. Understand and Define the Problem 
	 ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,

	 What’s involved?  
	interview users. What are their expectations? What data do they need to access? write a requirements analysis report

	2. Determine Input and Output 
	Typed input by user: amount of change requested (an integer between 1 and 99) 

	Printed output:  
	Number of quarters given  
	Number of dimes given  
	Number of nickels given  
	Number of pennies given
	*/

	static Scanner sc;
	
	enum CURRENCY {
		quarters, dimes, nickels, pennies 
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of money you have ... ");
		double change = getChangeInput();
		int[] yourChange = calculateChange(change);
		
		System.out.println("You have the following change: ... \n" 
		+ 	yourChange[0] + " " + CURRENCY.quarters  + "\n" 
		+  yourChange[1] + " " + CURRENCY.dimes + "\n"
		+ 	yourChange[2] + " " + CURRENCY.nickels  + "\n" 
		+  yourChange[3] + " " + CURRENCY.pennies + "\n");
		
	}

	private static double getChangeInput() {
		return sc.nextDouble();
	}

	public static int[] calculateChange(double change) {
		int[] changePart = {0,0,0,0};
		// int changeCopy = (int)(change * 100);
		int changeCopy = (int)change;
		
		if (changeCopy % 25 != 0) {
			changePart[0] = (int)(changeCopy / 25);
			changeCopy -= (int)changePart[0] * 25;
		} 
		if (changeCopy % 10 != 0) {
			changePart[1] = (int)(changeCopy / 10);
			changeCopy -= (int)changePart[1] * 10;
		}
		if (changeCopy % 05 != 0) {
			changePart[2] = (int)(changeCopy / 05);
			changeCopy -= (int)changePart[2] * 05;
		}
		if (changeCopy % 1 == 0) {
			changePart[3] = (int)(changeCopy / 1);
			changeCopy -= (int)changePart[3] * 1;
		}
		
		return changePart;
	}

}
