package com.xworkz.corejava.collection.list;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student suraj = new Student("Suraj","s01","JNNC");
		Student ritesh = new Student("Ritesh","s02","MPC");
		Student mohmmad = new Student("Mohmmad","s03","RIT");
		Student milan = new Student("Milan","s04","CUTM");
		Student pranay = new Student("Pranay","s05","CUTM");
		
		
		students.add(suraj);
		students.add(ritesh);
		students.add(mohmmad);
		students.add(milan);
		students.add(pranay);
		
		System.out.println("trainer of students is asha");
		
		for(Student s : students) {
			if(s.college.equals("CUTM")) {
				System.out.println(s);
			}
		}
		
		System.out.println(students.contains(suraj));
}

}