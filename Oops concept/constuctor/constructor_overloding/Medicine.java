package com.xworkz.corejava.constuctor.constructor_overloding;

public class Medicine {
	String name;
	double price;
	String dose;
	
	Medicine(){
		System.out.println("I am a default constuctor.");
		
	}
	
 	Medicine(String name1,double price1,String dose1){
		System.out.println("I am a parameterized constuctor.");
		name = name1;
		price = price1;
		dose = dose1 ;
		
	}
   
}
