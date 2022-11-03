package com.xworkz.corejava.abstraction.interface_examples.multiple_inheritancedemo;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		
		TaxCalculator taxCalculator = new TaxCalculator();
		
		taxCalculator.electricityTax();
		taxCalculator.incomeTax();
		taxCalculator.CentralTax();
	}

}
