package com.ca.week4.wed;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBMarshall {
	
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("myName");
		customer.setAge(26);
		
		Customer customer1 = new Customer();
		customer1.setId(200);
		customer1.setName("Dude");
		customer1.setAge(32);
		
		CustomerList cList = new CustomerList();
		
			
		try {
			File file = new File("H:\\\\CA\\file.xml");
			JAXBContext jaxbContent = JAXBContext.newInstance(CustomerList.class);
			Marshaller jaxbMarshaller = jaxbContent.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(cList, file);
			jaxbMarshaller.marshal(cList, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
}
