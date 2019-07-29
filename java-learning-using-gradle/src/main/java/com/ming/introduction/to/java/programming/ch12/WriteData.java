package com.ming.introduction.to.java.programming.ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("scores.txt");
		if(file.exists()) {
			System.out.println("File is exist");
			System.exit(1);
		}

		PrintWriter output = new PrintWriter(file);
		
		output.print("Penny Hardaway ");
		output.println(100);
		output.print("Grant Hill ");
		output.println(90);
		
		output.close();
		
	}

}
