package com.ca.hackerrank;

import java.util.Scanner;

public class PlusMinus {

    static Scanner sc; 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        sc = new Scanner(System.in);
        
        int arrSize = getInput();
        double[] nums = getArrInput(new double[arrSize]);
        calculatePlusMinus(arrSize, nums);
    }
    
    private static int getInput() {
         return sc.nextInt();
    }
    
    private static double[] getArrInput(double[] arrSize) {
       for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = sc.nextDouble();
       }
        return arrSize;
    }
    
    private static void calculatePlusMinus(int sizeOfArr, double... nums) {
        double posSum = 0;
        double negSum = 0;
        double zeroSum = 0;
        
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] > 0) {
                posSum += nums[i];
            } else if (nums[i] < 0) {
                negSum -= nums[i];
            } else {
                zeroSum++;
            }
        }
        
        System.out.println(divideNums(posSum, nums.length) + "\n" + divideNums(negSum, nums.length) + "\n" + divideNums(zeroSum, nums.length) );
    }
    
	private static double divideNums(double numToSum, int numCount) {
		return numToSum / numCount;
	}

}
