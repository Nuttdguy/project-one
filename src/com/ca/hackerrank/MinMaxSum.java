package com.ca.hackerrank;

import java.util.Scanner;

public class MinMaxSum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        // Test cases:
        // 1. a + b + c + d + e
        // 2. b + c + d + e + a
        // 3. c + d + e + a + b
        // 4. d + e + a + b + c
        // 5. e + a + b + c + d
        // We need to create a 2D array
        // 1. Use a loop, to fill the array
        // 2. Then perform sum of first for numbers for each
        
        long[] arr = { a, b, c, d, e };
        calculateMinMaxSumOfFour(load2DArray(arr));
        
    }
    
    private static long[][] load2DArray(long[] arr) {
    	long[][] array2D = new long[arr.length][arr.length];
    	
    	// Iteration #1
    	// Step 1: Row > loop first row
    	// Step 2: Col > loop columns of first row ++
    	// Step 3: Col > loop columns of first row ++
    	// Note: fill from the end index 
    	
    	// Iteration #2 > shift insertion index +1
    	// Step 1: startCol variable == is row, counter +1 for each loop
    	// Step 2: set up loop2; set upper bound of length == 0 < the current-row of outer loop iteration
    	// Note: creates a staggered 2D array, with single array values shifted
    	
    	for (int row = 0; row < arr.length; row++) {  	
    		
    		int inIdx = 0;
    		for (int startCol = row; startCol < arr.length; startCol++ ) {
        		array2D[row][startCol] = arr[inIdx]; 		
    			inIdx++;
    		}
    		for (int col = 0; col < row; col++ ) {
    			array2D[row][col] = arr[inIdx];
    			inIdx++;
    		}
    		// System.out.println();
    	}
    	return array2D;
	}

    
	private static void calculateMinMaxSumOfFour(long[][] args) {
		long greatestSum = 0L;
		long currentSum = 0L;
		long lesserSum = 0L;
		
		for (int row = 0; row < args.length; row++ ) {
			currentSum = 0;
			for (int col = 0; col < args[row].length-1; col++ ) {
				currentSum += args[row][col];
				if (row == 0) {
					greatestSum = currentSum;
					lesserSum = currentSum;
				}
			}
			if (currentSum > greatestSum ) {
				greatestSum = currentSum;
			} 
			if (currentSum < lesserSum ){
				lesserSum = currentSum;
			}
			// System.out.println("Greatest Sum: " + greatestSum + " ||  Lesser Sum: " + lesserSum);
		}
		System.out.println(lesserSum + " " + greatestSum);
    }
	
}
