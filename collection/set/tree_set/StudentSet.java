package com.xworkz.corejava.collection.set.tree_set;

import java.util.TreeSet;

public class StudentSet {
	public static void main(String[] args) {
		
		Student ritesh = new Student();
		ritesh.setId(100);
		ritesh.setName("ritesh");
		Student suraj = new Student();
		suraj.setId(300);
		suraj.setName("suraj");
		Student milan  = new Student();
		milan.setId(200);
		milan.setName("milan");
		Student bharat = new Student();
		bharat.setId(400);
		bharat.setName("bharat");
		Student tophan = new Student();
		tophan.setId(500);
		tophan.setName("tophan");
		
		TreeSet<Student> students =
				new TreeSet<>(new StudentComparator());
		
		students.add(milan);
		students.add(ritesh);
		students.add(suraj);
		students.add(bharat);
		students.add(tophan);
		
		System.out.println(students);
}
	
}
