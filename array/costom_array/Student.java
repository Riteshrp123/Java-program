package com.xworkz.corejava.array.costom_array;

public class Student {

	 String name;
    int  rollNo;
    String branch;
    String college;
    
	public Student(String name, int rollNo, String branch, String college) {
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.college = college;
		 	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", branch=" + branch + ", college=" + college + "]";
	}

	

}
