package com.xworkz.polymorphism1.MethodeOverRiding;


public class MethodeoverridingDemo {
	
	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
	System.out.println("RBI Rate of Interest: "+rbi.getIntrestRate());
	
	System.out.println("SBI Rate of Interest: "+sbi.getIntrestRate());
	
	System.out.println("HDFC Rate of Interest: "+hdfc.getIntrestRate());
	
	
	 
	}
	
	

}
