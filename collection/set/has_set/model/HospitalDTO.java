package com.xworkz.corejava.collection.set.model;

import java.util.HashSet;

public class HospitalDTO {
	String name;
	HashSet<DoctorDTO> doctors;
	
	public HospitalDTO(String name,HashSet<DoctorDTO> doctors) {
		this.name = name;
		this.doctors = doctors;
		}
}
