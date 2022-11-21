package com.xworkz.corejava.type_casting;

public class Downcasting {
	public static void main(String[] args) {
		
		Tree tree = new Mango();
		Mango mango = (Mango) tree;
		
		mango.provideOxygen();
		mango.providesMangoFruits();
	}

}
