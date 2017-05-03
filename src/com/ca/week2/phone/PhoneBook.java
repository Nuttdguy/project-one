package com.ca.week2.phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	enum SEARCHPARAM {
		FIRSTNAME, LASTNAME, FULLNAME, NUMBER, CITY, STATE
	}
	
	//==|| Fields ||==|| 
	private List<Record> recordList;
	
	
	//==|| Constructors  ||==||
	public PhoneBook() {
		this.recordList = new ArrayList<>();
	}
	
	//==|| Methods ||==|| 
	
	//  Get records 
	public List<Record> getRecordList() {
		return this.recordList;
	}
		
	//  Add record to phone List
	public boolean addRecord(Record record) {
		this.recordList.add(record);
		int previousSize = recordList.size();
		
		if (recordList.size() > previousSize) {
			return true;  //  record was added successfully
		} else {
			return false;  //  record was not added successfully
		}
	}
	
	//  Search for an existing entry, sort by asc.
	//  1. by first name
	//  2. by last name
	//  3. by full name ** all matching entries
	//  4. by telephone number
	//  5. by city
	//  6. by state
	public List<Record> findRecordBy(String query) {
		List<Record> queryList = new ArrayList<>();
		
		for (Record record : recordList) {
			if ( record.equals(query) ) {
				queryList.add(record);
			} 
		}
		return queryList;
	}
	
	//  Delete a record
	//  1. by given telephone #
	public String deleteRecordBy() {
		return null;
	}
	
	//  Update a record
	//  1. by given telephone #
	public String updateRecordBy() {
		return null;
	}

	
}
