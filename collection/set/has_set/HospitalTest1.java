package com.xworkz.corejava.collection.set;

import java.util.HashSet;

import com.xworkz.corejava.collection.set.exception.HospitalException;
import com.xworkz.corejava.collection.set.model.DoctorDTO1;
import com.xworkz.corejava.collection.set.model.HospitalDTO1;
import com.xworkz.corejava.collection.set.service.HospitalService1;
import com.xworkz.corejava.collection.set.service.HospitalServiceImpl1;

public class HospitalTest1 {
	public static void main(String[] args) {
		HospitalService1 hospitalService1 = new HospitalServiceImpl1();
		
		
		DoctorDTO1 ritesh = new DoctorDTO1();
		ritesh.setName("Ritesh");
		ritesh.setSpecialization("nurologist");
		HashSet<DoctorDTO1> apollodoctors = new HashSet<DoctorDTO1>();
		apollodoctors.add(ritesh);
		
		DoctorDTO1 pranay = new DoctorDTO1();
		pranay.setName("Pranay");
		pranay.setSpecialization("dentist");
		HashSet<DoctorDTO1> manipaldoctors = new HashSet<DoctorDTO1>();
		manipaldoctors.add(pranay);
		
		HospitalDTO1 apollo = new HospitalDTO1();
		apollo.setName("apollo");
		apollo.setDoctors(apollodoctors);
		HospitalDTO1 manipal = new HospitalDTO1();
		manipal.setName("manipal");
		manipal.setDoctors(manipaldoctors);
		
		HospitalDTO1 apollo1 = new HospitalDTO1();
		apollo1.setName("apollo");
		apollo.setDoctors(apollodoctors);
		
		try {
			hospitalService1.add(apollo);
			hospitalService1.add(manipal);
			hospitalService1.add(apollo1);
			
		} catch (HospitalException e) {
			System.out.println(e);
		}
		try {
			HospitalDTO1 hospital = hospitalService1.getHospital("apollo");
			System.out.println("details of Apollo :" +hospital);
		} catch (HospitalException e) {
			System.out.println(e.getMessage());
		}
	}

}
