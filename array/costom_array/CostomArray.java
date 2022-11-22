package com.xworkz.corejava.array.costom_array;  


public class CostomArray {
	public static void main(String[] args) {
		
		Student ritesh = new Student("Ritesh", 01, "CS", "MPC");
		Student shakti = new Student("Shakti", 04, "CS", "CU");
		Student pranay = new Student("Pranay", 03, "Dpharm", "CU");
		Student sameer = new Student("Sameer", 02, "Mechanical", "DTP");
		
		Student[] students = {ritesh,shakti,pranay,sameer};
		int count =0;
		for(int i=0; i < students.length;i++) {
			if(students[i].college.equals("CU")) {
				System.out.println("Pranay is studied in the college : "+ students[i].college);
				count++;
			}
		}
	if(count==0) {
		System.out.println("Pranay is not avalale in the list");
	}
	}
}
