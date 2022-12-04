package com.xworkz.corejava.exception.checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionDemo { 
	public static void main(String[] args) {
		
		try {
		FileReader file = new FileReader("C:\\Black panther.txt");
		BufferedReader reader = new BufferedReader(file);
		for(int i = 0; i<2; i++) {
			System.out.println(reader.readLine());
		}
	}
	catch(IOException e) {
		System.out.println("Exception caugh");
	}
		System.out.println("Manin ended");
		
	}

}
