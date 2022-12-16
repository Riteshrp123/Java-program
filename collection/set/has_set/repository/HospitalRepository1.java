package com.xworkz.corejava.collection.set.repository;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.model.HospitalDTO1;

public interface HospitalRepository1 {
	void add(HospitalDTO1 hospitaldetail);
	
	HashSet<HospitalDTO1> getHospitals();

}
