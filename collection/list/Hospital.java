package com.xworkz.corejava.collection.list;

import java.util.ArrayList;

public class Hospital {
	
	String name;
	ArrayList<Doctor> doctors;
	
	public Hospital(String name,ArrayList<Doctor> doctors) {
	    this.name = name;
	    this.doctors = doctors;
	    
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", doctors=" + doctors + "]";
	}	

}
