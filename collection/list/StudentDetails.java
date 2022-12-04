package com.xworkz.corejava.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentDetails {

	public static void main(String[] args) {
		
		
		Student suraj = new Student("Suraj","s01","JNNC");
		Student ritesh = new Student("Ritesh","s02","MPC");
		Student mohmmad = new Student("Mohmmad","s03","RIT");
		Student milan = new Student("Milan","s04","CUTM");
		Student pranay = new Student("Pranay","s05","CUTM");
		Student rabi = new Student("Rabi","s06","TVM");
		Student shubham = new Student("Suhbam","s07","SIMS");
		Student sameer = new Student("Sameer","s08","TVM");
		Student prakash = new Student("Prakash","s09","VSSUT");
		
		
		ArrayList<Student> ashaStudentList = new ArrayList<Student>();	
		ashaStudentList.add(suraj);
		ashaStudentList.add(ritesh);
		ashaStudentList.add(mohmmad);
		
		ArrayList<Student> omkarStudentList = new ArrayList<Student>();	
		omkarStudentList.add(milan);
		omkarStudentList.add(pranay);
		omkarStudentList.add(rabi);
		
		ArrayList<Student> rajshekharStudentList = new ArrayList<Student>();	
		rajshekharStudentList.add(shubham);
		rajshekharStudentList.add(sameer);
		rajshekharStudentList.add(prakash);
		
		Trainer asha = new Trainer("Asha", ashaStudentList);
		Trainer omkar = new Trainer("Omkar", omkarStudentList);
		Trainer rajshekhar = new Trainer("Rajshekhar", rajshekharStudentList);
		
		ArrayList<Trainer> TrainerList = new ArrayList<Trainer>();
		
		TrainerList.add(omkar);
		TrainerList.add(asha);
		TrainerList.add(rajshekhar);
		
		ListIterator<Trainer> itr = TrainerList.listIterator();
		
		while(itr.hasNext()) {
			Trainer trainer = itr.next();
			if(trainer.name.equals("Rajshekhar")) {
				System.out.println("Rajshekhar's students details: ");
				ArrayList<Student> students = trainer.students;
				System.out.println(students);
			}
		}
			
	}
}

