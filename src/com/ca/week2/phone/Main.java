package com.ca.week2.phone;

import java.util.List;
import java.util.Scanner;
import com.ca.week2.phone.Record;
import com.sun.beans.finder.FieldFinder;

import static com.ca.week2.phone.Record.RecordBuilder;

// 	Write a program to simulate the actions of a phonebook.
//	Your program should be able to :
//	Add new entries 
//	Search for an existing entry
//	Search by first name *
//	Search by last name *
//	Search by full name *note name is not unique therefore the result should be an array of Person Objects.
//	Search by telephone number
//	Search by city or state
//	Delete a record for a given telephone number
//	Update a record for a given telephone number
//	Show all records in asc order
//	An option to exit the program 
//	
// Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record
//    2. Delete a record
//               Etc.. where 1 representing the action for adding a record and 2 representing the action
//               for deleting a record.
//Your program should run until the user selects the exit option. 
//Your program should have a minimum of 2 classes a Person class, an Address  class.
//
//Test case :
//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
//John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
//John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
//
//Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.
//
//Optional add additional features to your program, for storing cell, home, work and fax numbers. 
//Also features for storing events like birthday, anniversary, email… etc   

public class Main {

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		PhoneBook phone = new PhoneBook();
		boolean run = true;
		int choice = 0;
		Record entry = null;
		
		
		System.out.println(MESSAGE.DISPLAYOPTION.getMessage());
		
		while(run) {
			// Display menu options
			displayMainMenuOptions();
			
			// Get the user choice
			try {
				choice = getInput();			
				
				switch (choice) {
					case 1:  //  Add new "Phone record"
						entry = addNewRecord(entry); 
						phone.addRecord(entry);
						break;
					case 2:  //  Search for record
							searchForRecord(phone);
							break;
					case 3: 
							printRecords(phone);
							break;
					case 4: // Update a record
							if ( phone != null ) {
								updateMenuOptions(phone);
							} else {
								System.out.println("Sorry, no records to display. ");
							}
							break;
					case 5: //  delete a record
							deleteRecord(phone);
							System.out.println("The following records remain: \n");
							printRecords(phone);
							break;
					case 6: // Exit program
							run = false;
					break;
					}
			} catch(Exception ex) {
				System.out.println("You entered an invalid option, try again");
			}
		}
		
	}

	private static int getInput() throws Exception {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}
	private static String getValueIntoClassField() {
		sc = new Scanner(System.in);	
		return sc.nextLine();
	}

	private static void displayMainMenuOptions() {
		System.out.println("1. " + MENU.ADD_NEW_RECORD.getString());
		System.out.println("2. " + MENU.SEARCH_FOR_RECORD.getString());
		System.out.println("3. " + MENU.SHOW_ALL_RECORDS.getString());
		System.out.println("4. " + MENU.UPDATE_RECORD.getString());
		System.out.println("5. " + MENU.DELETE_RECORD.getString());		
		System.out.println("6. " + MENU.EXIT_PROGRAM.getString());
	}
	
	private static void updateMenuOptions(PhoneBook phone) throws Exception {
	
		int count = 0;
		for (Record r : phone.getRecordList() ) {
			System.out.println(count + ": " + r );
			count++;
		}
		
		System.out.println("Which would record would you like to update? ");
		int updateIdx = getInput();
		
		System.out.println("What would you like to do with the record?");
		System.out.println("1: " + MENU.UPDATE_FIRST_NAME.getString());
		System.out.println("2: " + MENU.UPDATE_MIDDLE_NAME.getString());
		System.out.println("3: " + MENU.UPDATE_LAST_NAME.getString());
		System.out.println("4: " + MENU.UPDATE_NUMBER.getString());
		System.out.println("5: " + MENU.UPDATE_CITY.getString());
		System.out.println("6: " + MENU.UPDATE_STATE.getString());
		System.out.println("7: " + MENU.UPDATE_ZIP.getString());
		int menuChoice = getInput();

		String updateValue = getValueIntoClassField();
		 if( menuChoice == 1)
			phone.getRecordList().get(updateIdx).setFirstName(updateValue );
		 if( menuChoice == 2)
			phone.getRecordList().get(updateIdx).setMiddleName( updateValue );			
		 if( menuChoice == 3)
			 phone.getRecordList().get(updateIdx).setLastName( updateValue );
		 if( menuChoice == 4)
			 phone.getRecordList().get(updateIdx).setNumber( updateValue );
		 if( menuChoice == 5)
			 phone.getRecordList().get(updateIdx).setCity( updateValue );
		 if( menuChoice == 6)
			 phone.getRecordList().get(updateIdx).setState( updateValue );
		 if( menuChoice == 7)
			 phone.getRecordList().get(updateIdx).setState( updateValue );
		 
	}

	private static Record addNewRecord(Record entry) {
		entry = new Record();
		
		System.out.println(MENU.ADD_FIRST_NAME.getString());
		entry.setFirstName(getValueIntoClassField() );
		
		System.out.println(MENU.ADD_MIDDLE_NAME.getString());
		entry.setMiddleName( getValueIntoClassField() );
		
		System.out.println(MENU.ADD_LAST_NAME.getString());
		entry.setLastName( getValueIntoClassField() );
		
		System.out.println(MENU.ADD_NUMBER.getString());
		entry.setNumber( getValueIntoClassField() );
		
		System.out.println(MENU.ADD_CITY.getString());
		entry.setCity( getValueIntoClassField() );
		
		System.out.println(MENU.ADD_STATE.getString());
		entry.setState( getValueIntoClassField() );
		
		System.out.println(MENU.ADD_ZIP.getString());
		entry.setState( getValueIntoClassField() );
		
		return entry;
	}
	
	public static void deleteRecord( PhoneBook phone) throws Exception {
		int count = 0;
		for (Record r : phone.getRecordList() ) {
			System.out.println(count + ": " + r );
			count++;
		}
		System.out.println("Which would record would you like to remove? ");
		int choice = getInput();
		
		phone.getRecordList().remove(choice);
		
	}
	
	public static void searchForRecord(PhoneBook phone) throws Exception {
		
		System.out.println("Enter a parameter to search for?");
		String searchParam = getValueIntoClassField();
		List<Record> result = phone.findRecordBy(searchParam);
		int count = 0;
		for (Record r : result) {
			count++;
			System.out.println( count + ": " + r);
		}
		System.out.println();
		
	}
	
	private static void printRecords(PhoneBook phone) {
		System.out.println();
		for (Record r : phone.getRecordList()) {
			System.out.println(r.getFirstName() + " "
					+ r.getMiddleName() + " "
					+ r.getLastName() + ", "
					+ r.getCity() + ", "
					+ r.getState() + " || "
					+ r.getNumber() );
		}
		System.out.println();
	}

}
