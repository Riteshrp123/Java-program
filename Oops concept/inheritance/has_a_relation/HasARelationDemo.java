package com.xworkz.corejava.inheritance.has_a_relation;

public class HasARelationDemo {
	public static void main(String[] args) {
		
		Library sharada = new Library();
		
		sharada.name= "Xworkz";
		sharada.noOfBooks = 100;
		sharada.location = "Bengaluru";
		sharada.student = new Student();
		
		System.out.println("Library name : "+ sharada.name );
		System.out.println("student name : "+ sharada.student.name );
		System.out.println("student rollno : "+ sharada.student.rollno );
		System.out.println("student college : "+ sharada.student.college );
		
	}

}
