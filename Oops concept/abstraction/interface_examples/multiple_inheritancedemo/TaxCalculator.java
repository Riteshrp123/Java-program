package com.xworkz.corejava.abstraction.interface_examples.multiple_inheritancedemo;

public class TaxCalculator implements StateTax, CentralTax{
	
	public void incomeTax() {
		System.out.println("Income tax is 100 Rs");
		}

	
	public void electricityTax() {
		System.out.println("Electricity tax is 50 Rs");
		
	}
	public void CentralTax() {
		System.out.println("CentralTax tax is 200 Rs");
		
	}

}
