package com.ming.introduction.to.java.programming.ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataWithAutoClose {

	public static void main(String[] args) {

		File file = new File("scores.txt");
		
		try( Scanner input = new Scanner(file) ) {
			while(input.hasNext()) {
				String giveName = input.next();
				String familyName = input.next();
				int score = input.nextInt();
				
				System.out.println(String.format("%s %s's score is %d", giveName, familyName, score));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
