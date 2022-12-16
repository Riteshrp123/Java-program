package com.xworkz.corejava.collection.set.repository;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.model.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {
	
    HashSet<HospitalDTO> hospitals = new HashSet<HospitalDTO>();
    
   public void add(HospitalDTO hospitaldetail) {
	   hospitals.add(hospitaldetail);
	   System.out.println("hospitaldetail detail added successfully.");
   }
}
