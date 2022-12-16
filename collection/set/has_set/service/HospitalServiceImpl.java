package com.xworkz.corejava.collection.set.service;

import com.xworkz.corejava.collection.set.model.HospitalDTO;
import com.xworkz.corejava.collection.set.repository.HospitalRepository;
import com.xworkz.corejava.collection.set.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService{
	
	HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
	
	public void add(HospitalDTO hospitaldetail) {
		if(hospitaldetail != null) {
			hospitalRepository.add(hospitaldetail);
		}
		else {
			System.out.println("No content found in Hospital detail.");
		}
	}
	

}
