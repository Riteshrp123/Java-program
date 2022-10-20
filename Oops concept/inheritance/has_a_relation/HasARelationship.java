package com.xworkz.corejava.inheritance.has_a_relation;

public class HasARelationship {

	public static void main(String[] args) {
		
	Human rithesh=new Human();
	Heart red=new Heart();
	
	rithesh.name="Raj";
	rithesh.age=25;
	rithesh.address="btm lAYOUT";
	rithesh.heart=new Heart();
	
	System.out.println("Name of human is : "+rithesh.name);
	System.out.println("Work of heart : "+red.work);
		
	}
}
