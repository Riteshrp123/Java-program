package com.xworkz.corejava.object_class_methods.equals_method;

public class Pen {
	String name;
	double price;
	
    public Pen(String name,double price) {
    	this.name = name;
    	this.price = price;
    	 }
    
    public boolean equals(Object obj) {
    	Pen pen = (Pen) obj;
    	Pen other =(Pen) obj;
    	if(this.price == pen.price) {
    		return true;
    	}
    	else {
    		return false;
    }
     
    }
}
