package com.ca.week2.phone;

import java.util.Scanner;
import com.ca.week2.phone.Record;
import static com.ca.week2.phone.Record.RecordBuilder;

public class Main {

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Phone phone = new Phone();
		
		System.out.println(MESSAGE.ADDRECORD.getMessage());
		Record entry = newPhoneRecord();
		phone.addRecord(entry);
		
		// Print out data that was added
		for (Record r : phone.getRecordList()) {
			System.out.println(r.getFirstName() + " "
					+ r.getMiddleName() + " "
					+ r.getLastName() + ", "
					+ r.getCity() + ", "
					+ r.getState() + " || "
					+ r.getNumber() );
		}
		
	}

	private static Record newPhoneRecord() {
		Record entry = new RecordBuilder()
				.addFirstName(sc.nextLine())
				.addMiddleName(sc.nextLine())
				.addLastName(sc.nextLine())
				.addNumber(sc.nextLine())
				.addCity(sc.nextLine())
				.addState(sc.nextLine())
				.build();
		return entry;
	}

}
