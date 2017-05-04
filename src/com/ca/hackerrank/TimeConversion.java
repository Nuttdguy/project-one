package com.ca.hackerrank;

import java.util.Scanner;

public class TimeConversion {

	static Scanner sc;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	sc = new Scanner(System.in);
    	
    	formatTime(getInput());
    }
    
	private static String getInput() {
		return sc.nextLine();
	}
	
	private static void formatTime(String input) {
		String[] timeArr = input.substring(0, input.length() - 2).split(":");
		String meridiem = input.substring(input.length() - 2);
		
		int hour = Integer.valueOf(timeArr[0]);
		int minute = Integer.valueOf(timeArr[1]);
		int second = Integer.valueOf(timeArr[2]);
		
		if (01 <= hour && hour <= 12 ) {
			if (meridiem.equals("PM") && hour != 12) {
				hour = hour + 12;
			} else if (meridiem.equals("AM") && hour + 12 == 24 ) {
				hour = 0;
			} 
		} 
		
		String s = doPrefixZero(hour)+":"+doPrefixZero(minute)+":"+doPrefixZero(second);
		System.out.println(s);
	}

	private static String doPrefixZero(int time) {
		if ( time >= 0 && time <= 10 ) 
			return "0" + String.valueOf(time);
		return String.valueOf(time);
	}

}
