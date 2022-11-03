package com.xworkz.corejava.constuctor.constructor_chaining;

public class Watch {
  String name;
  double price;
  String colour;
   String type;
  
  Watch(){
	  this("fast track",2000.100);
	  System.out.println("I am a default constuctor");
  }
  
  Watch(String name, double price) {
	  this(name,price,null,null);
	  System.out.println("I am a 2 parameterizer constructor");
	  this.name = name;
	  this.price = price;
	 
  }
  
  Watch(String name, double price, String colour, String type) {
	  System.out.println("I am a 4 parameterizer constructor");
	  this.name = name;
	  this.price = price;
	  this.colour = colour;
	  this.type = type;
	  
	  
	  
  }
}
