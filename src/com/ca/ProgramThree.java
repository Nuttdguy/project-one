package com.ca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramThree {

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int firstUserNum;
		int secondUserNum;
		int userChoice;

		try {
			System.out.println("Please enter a first number to calculate ...");
			firstUserNum = getInputNum();
			
			System.out.println("\nPlease enter a second number to calculate ...");
			secondUserNum = getInputNum();
			
			System.out.println("\nPlease select an action to perform on the numbers ...");
			userChoice = getCalculationChoice();
			
			System.out.println(performCalculation(userChoice, firstUserNum, secondUserNum));
		} catch (InputMismatchException io) {
			System.out.println("\nDarn it, you have to enter a number!");
		}
		
		sc.close();

	}

	private static int getInputNum() throws InputMismatchException {
		return sc.nextInt();
	}

	private static int getCalculationChoice() throws InputMismatchException {
		System.out.println("What would you like to do?\n1. Add\n2. Subtract\n3. Multiply\nYour choice is ... ");
		boolean isValid = false;
		int choice;

		do {
			choice = sc.nextInt();
			if (choice == 1 || choice == 2 || choice == 3) 
				isValid = true;
		} while (!isValid);
		
		return choice;
	}

	private static String performCalculation(int userChoice, int firstUserNum, int secondUserNum) {
		if (userChoice == 1)
			return addNumbers(firstUserNum, secondUserNum);
		else if (userChoice == 2)
			return subtractNumbers(firstUserNum, secondUserNum);
		else if (userChoice == 3)
			return multiplyNumbers(firstUserNum, secondUserNum);
		else
			return "Invalid choice";
	}

	private static String addNumbers(int firstUserNum, int secondUserNum) {
		return String.format("%d + %d add up to %d", firstUserNum, secondUserNum, firstUserNum + secondUserNum);
	}

	private static String subtractNumbers(int firstUserNum, int secondUserNum) {
		return String.format("%d subtracted from %d is %d", firstUserNum, secondUserNum, firstUserNum - secondUserNum);
	}

	private static String multiplyNumbers(int firstUserNum, int secondUserNum) {
		return String.format("%d multiplied by %d is %d", firstUserNum, secondUserNum, firstUserNum * secondUserNum);
	}
}
