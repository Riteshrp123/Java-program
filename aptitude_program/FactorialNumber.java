package com.xworkz.corejava.aptitude_program;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter any number");//10
	        long num = scr.nextInt();//num=10;
			if (num > 0 && num < 125) {
				long  result = 1;

				while (num !=1) {
					result = result * num;//1*10;
					num--;//9
		  			
				}
				System.out.println(result);//10*9*.....==1672827;
				
			} else {
				System.out.println("Enter number " + num + " is not valid please enter from 1-125");

			}
		}
	}

}
