package com.ca.week4.wed;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshall {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("H:\\\\CA\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
			
		} catch(JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
