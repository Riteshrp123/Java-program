package com.xworkz.corejava.aptitude_program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {

		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int n=10;

		while (n > 0) {

			int num = s.nextInt();
			int value = num, result = 0;

			while (num > 0) {
				int reminder = num % 10;
				result = result + (reminder * reminder * reminder);

				num = num / 10;
		}
		
		if (value == result)
			System.out.println("Armstrong number");
		else
			System.out.println("not a Armstrong number");
}
	} 
}
