package com.ca.day02;

import java.util.Scanner;

public class ProjectOne {


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
        load2DArray(arr);
        
        // calculateMinMaxSumOfFour(arr);
        
    }
    
    private static long[][] load2DArray(long[] arr) {
    	long[][] array2D = new long[arr.length][arr.length];
    	
    	for (int row = 0; row < arr.length; row++) {
    		// set inverse length here, use to set backward or forward increment
    		for (int col = 0; col < arr.length; col++ ) {
    			int colRowPos = col-row;
    			int rowColPos = row-col;
    			
        		int insertPos = row < 1 ? (col-row) : (row-col);
    			// need conditional to check whether less than five
    			// need to use minus and plus ... how???
    			// round 1, col starts at 0
    			// round 2, col starts at 1
    			// round 3, col starts at 2
//    			if (col != 0) {
//        			array2D[row][col] = arr[col+row];
//    			} else {
	    		array2D[row][col] = arr[insertPos]; 
    			System.out.print(array2D[row][col]);
    		}
    		System.out.println();
    	}
    	return array2D;
	}

    
	private static void calculateMinMaxSumOfFour(Long...longs) {

        
    }
	
}
