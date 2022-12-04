package com.xworkz.corejava.exception.checked_exception;

public class ATMMachine {
	void draw(int amount) throws AtmException{
		if(amount%100 !=0 || amount>50000) {
			AtmException ate     = new AtmException();
			throw ate;
		}
		else {
			System.out.println("Collect Cash...");
		}
	}
}
