package com.xworkz.corejava.object_class_methods.clone_method;

public class RadioTest {
public static void main(String[] args) {
	
	Radio sony = new Radio("sony",10000.00,new Battery("Cello"));
	try {
		
		Radio copyOfSony = sony.clone();
		System.out.println("details of Sony : "+ sony);
		System.out.println("details of copyOfSony : "+ copyOfSony);
		copyOfSony.price = 5000.00;
		copyOfSony.battery.brand="exide";
		System.out.println("After a change: ------------");
		System.out.println("details of Sony : "+ sony);
		System.out.println("details of copyOfSony : "+ copyOfSony);
		
	}catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
}
}
