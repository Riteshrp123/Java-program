package com.xworkz.corejava.constuctor.constructor_overloding;

public class ConstructorOverloading {
	public static void main(String[] args) {
		
	Medicine medicine = new Medicine();
		System.out.println(medicine.name);
		
	Medicine paracetamol = new Medicine("paracetamol", 10.00,"2nd");
		
		System.out.println("medicine name :"+ paracetamol.name);
		System.out.println("medicine price :"+ 10.00);
		System.out.println("medicine dose :"+ 2 );

	}

}
