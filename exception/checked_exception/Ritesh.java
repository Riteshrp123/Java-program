package com.xworkz.corejava.exception.checked_exception;

public class Ritesh {
	public static void main(String[] args) {
		int amount = 10000;
		ATMMachine atm = new ATMMachine();
		
		try {
			atm.draw(amount);
		}catch (AtmException e) {
			if(amount%100 !=0) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		}
	}

}
