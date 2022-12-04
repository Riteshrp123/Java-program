package com.xworkz.corejava.exception.checked_exception;

import java.util.Scanner;

public class VoterList {
	
	 public static void main(String[] args) {  
		  
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your age in year: ");
			int age = input.nextInt();
			VoterList person = new VoterList(age);
			person.checkEligibility();

			}		
		int age;
		
		VoterList(int age){
			this.age = age;
		}

		void checkEligibility() {
			try {
				if(age < 18) {
				     throw new NotEligibleException("Not eligible for vote due to under age.");
				}
					System.out.println("you eligible to voting");
			} 
			catch (NotEligibleException e) {
				System.out.println(e.getMessage());
			}
	}
}