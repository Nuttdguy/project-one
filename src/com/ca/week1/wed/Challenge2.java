package com.ca.week1.wed;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge2 {

	//	Write a method to prompt the user for base-width and height of a triangle,
	//	then calculate the area of the Triangle.
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double baseWidth;
		double height;
		
		System.out.println("Lets calculate the area of a triangle.");
		try {
			
		System.out.println("Enter the base width of the triangle to calculate: ");
		baseWidth = getDimension();
		
		System.out.println("Enter the height of the triangle to calculate: ");
		height = getDimension();
		
		System.out.println(String.format("The calculated area of the triangle is: %.2f", calculateAreaOfTriangle(baseWidth, height)) );
		
		} catch (InputMismatchException iex) {
			System.out.println("You were suppose to enter a number.");
		} catch (IllegalFormatConversionException cex) {
			System.out.println("Sorry, unable to convert number successfully.");
		}
		finally {
			sc.close();
		}
		
	}

	private static double getDimension() throws InputMismatchException {
		return sc.nextDouble();
	}
	
	private static double calculateAreaOfTriangle(double baseWidth, double height) {
		return (.5 * baseWidth) * height;
	}
	

}
