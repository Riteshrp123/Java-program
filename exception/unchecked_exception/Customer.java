package com.xworkz.corejava.exception.unchecked_exception;

public class Customer {
	public static void main(String[] args) {
		
		Dmart dmart = new Dmart();
		
		try {
			dmart.search(new Product("Atta",300.00));

		} catch (DmartException e)	{	
			System.out.println(e);
		}
	}

}
