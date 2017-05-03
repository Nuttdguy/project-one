package com.ca.week2.phone;

import java.util.Scanner;
import com.ca.week2.phone.Record;
import static com.ca.week2.phone.Record.RecordBuilder;

public class Main {

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		PhoneBook phone = new PhoneBook();
		boolean flag = false;
		int choice = 0;
		Record entry = null;
		
		System.out.println(MESSAGE.DISPLAYOPTION.getMessage());
		
		do {
			displayMenuOptions();
			choice = getInput();			
			switch (choice) {
			case 1:
				entry = addNewRecord(); 
				break;
			case 2:
				entry = addNewRecord();
			}
			
		} while(flag);

		phone.addRecord(entry);
		
		// Print data that was added to the console
		printRecords(phone);
		
	}

	private static int getInput() {
		return sc.nextInt();
	}

	private static void displayMenuOptions() {
		System.out.println("1. " + MENU.ADD_NEW_RECORD.getString());
		
		// Rework, review requirements and menu options; 
		System.out.println("2. " + MENU.ADD_FIRST_NAME.getString());
		System.out.println("3. " + MENU.ADD_MIDDLE_NAME.getString());
		System.out.println("4. " + MENU.ADD_LAST_NAME.getString());
		System.out.println("5. " + MENU.ADD_CITY.getString());
		System.out.println("6. " + MENU.ADD_STATE.getString());
		System.out.println("7. " + MENU.ADD_ZIP.getString());
		System.out.println("8. " + MENU.UPDATE_RECORD.getString());
		System.out.println("9. " + MENU.DELETE_RECORD.getString());		
		System.out.println("10. " + MENU.EXIT_PROGRAM.getString());
	}

	private static Record addNewRecord() {
		Record rc = new Record();
		
		System.out.println(MENU.ADD_FIRST_NAME.getString());
		rc.setFirstName(sc.nextLine());
		
		System.out.println(MENU.ADD_MIDDLE_NAME.getString());
		rc.setMiddleName(sc.nextLine());
		
		System.out.println(MENU.ADD_LAST_NAME.getString());
		rc.setLastName(sc.nextLine());
		
		System.out.println(MENU.ADD_NUMBER.getString());
		rc.setNumber(sc.nextLine());
		
		System.out.println(MENU.ADD_CITY.getString());
		rc.setCity(sc.nextLine());
		
		System.out.println(MENU.ADD_STATE.getString());
		rc.setState(sc.nextLine());
		
		System.out.println(MENU.ADD_ZIP.getString());
		rc.setState(sc.nextLine());
		
		return rc;
	}
	
	
	private static void printRecords(PhoneBook phone) {
		for (Record r : phone.getRecordList()) {
			System.out.println(r.getFirstName() + " "
					+ r.getMiddleName() + " "
					+ r.getLastName() + ", "
					+ r.getCity() + ", "
					+ r.getState() + " || "
					+ r.getNumber() );
		}
	}

}
