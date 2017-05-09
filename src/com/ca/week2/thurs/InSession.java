package com.ca.week2.thurs;

public class InSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s : compareTo("john", "alice", "brian")) {
			System.out.println(s);
		}

	}
	
	public static String[] compareTo(String name1, String name2, String name3) {
		String min;
		String max;
		String middle;
		
		if(name1.compareTo(name2) > 0) {
			max = name1;
			min = name2;
		} else {
			max = name2;
			min = name1;
		}
		if(name3.compareTo(max) > 0) {
			String temp = max;
			max = name3;
			middle = temp;
		} else if (name3.compareTo(min) <0) {
			String temp = min;
			min = name3;
			middle = temp;
		} else {
			middle = name3;
		}
		
		String[] myArr = {min, middle, max};
		return myArr;
	}

}
