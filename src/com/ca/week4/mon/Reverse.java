package com.ca.week4.mon;

public class Reverse {

	public static void main(String[] args) {

		System.out.println(reverse("Application"));
		System.out.println(fibonacci(34));
	}
	
	public static String reverse(String name) {
		if (name.length() == 1)
			return name;
		
		return reverse(name.substring(1) ) + name.substring(0, 1);
	}

	public static int factorial(int x) {
		if (x == 0)
			return 1;
		return x * factorial(x - 1);
	}
	
	public static int fibonacci(int n) {
		// base case -- to stop return call
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
