package com.ca.week3.fri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample2 {

	public static void main(String[] args) {

		String FILENAME = "H:\\\\CA\\account.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			String content = "This is the content to write into file.\n";
			bw.write(content);
			System.out.println("Done");
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
		
		File file = new File("H:\\\\CA\\account.txt");
		
		try ( Scanner scanner = new Scanner(file) ) {
			String line = scanner.nextLine();
			System.out.println(line);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
