package com.xworkz.corejava.collection.set;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.model.DoctorDTO;
import com.xworkz.corejava.collection.set.model.HospitalDTO;
import com.xworkz.corejava.collection.set.service.HospitalService;
import com.xworkz.corejava.collection.set.service.HospitalServiceImpl;

public class HospitalTest {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalServiceImpl();
		
		DoctorDTO ritesh = new DoctorDTO("ritesh", "neurologist");
		HashSet<DoctorDTO> doctors = new HashSet<DoctorDTO>();
		doctors.add(ritesh);
		HospitalDTO apollo = new HospitalDTO("apollo", doctors);
		
		hospitalService.add(apollo);;
	}

}
