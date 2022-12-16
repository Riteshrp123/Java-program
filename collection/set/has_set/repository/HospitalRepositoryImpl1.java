package com.xworkz.corejava.collection.set.repository;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.model.HospitalDTO;
import com.xworkz.corejava.collection.set.model.HospitalDTO1;

public class HospitalRepositoryImpl1 implements  HospitalRepository1 {
	
	HashSet<HospitalDTO1> hospitals = new HashSet<HospitalDTO1>();
	
public void add(HospitalDTO1 hospitaldetail) {
	boolean result = hospitals.add(hospitaldetail);
	if(result)
		System.out.println("hospitaldetail detail added successfully.");
	}

public HashSet<HospitalDTO1> getHospitals() {
	return hospitals;
	
}
}
