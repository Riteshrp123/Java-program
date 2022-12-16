package com.xworkz.corejava.collection.set.service;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.exception.HospitalException;
import com.xworkz.corejava.collection.set.model.HospitalDTO1;
import com.xworkz.corejava.collection.set.repository.HospitalRepository1;
import com.xworkz.corejava.collection.set.repository.HospitalRepositoryImpl1;

public class HospitalServiceImpl1 implements HospitalService1 {
         
	HospitalRepository1 hospitalRepository1 = new HospitalRepositoryImpl1();
	
	@Override
	public void add(HospitalDTO1 hospitaldetail) throws HospitalException {
	if(hospitaldetail != null) {
		hospitalRepository1.add(hospitaldetail);
	}
	else {
		throw new HospitalException();
			}
		}
	
	public HospitalDTO1 getHospital(String hospitalName) throws HospitalException {
		HashSet<HospitalDTO1> hospitals = hospitalRepository1.getHospitals();
		
		HospitalDTO1 hospitalDetail = null;
		
		for(HospitalDTO1 hospital:hospitals) {
			if(hospital.getName().equals(hospitalName)) {
				hospitalDetail = hospital;
			}
		}
		
		if(hospitalDetail == null) {
			throw new HospitalException();
			
		}
		return hospitalDetail;
	}
}
