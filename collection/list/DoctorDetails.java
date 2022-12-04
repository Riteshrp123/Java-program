package com.xworkz.corejava.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class DoctorDetails {
	public static void main(String[] args) {
		
		Doctor shiva = new Doctor("Shiva","a01","Pediatrics");
		Doctor ravi = new Doctor("Ravi","a02","Neurology");
		Doctor bhumi = new Doctor("Bhumi","a03","Psychiatry");
		Doctor vishnu = new Doctor("Vishnu","a04","Surgeon");
		Doctor ziva = new Doctor("Ziva","a05","Cardiologist");
		Doctor leo = new Doctor("Leo","a06","Pathology");
		Doctor hari = new Doctor("Hari","a07","Dentist");
		Doctor ram = new Doctor("Ram","a08","Psychiatry");
		Doctor sima = new Doctor("Sima","a09","Podiatrist");
		
		ArrayList<Doctor> manipalDoctorList = new ArrayList<Doctor>();
		manipalDoctorList.add(shiva);
		manipalDoctorList.add(ravi);
		manipalDoctorList.add(bhumi);
		
		ArrayList<Doctor> aiimsDoctorList = new ArrayList<Doctor>();
		
		aiimsDoctorList.add(vishnu);
		aiimsDoctorList.add(ziva);
		aiimsDoctorList.add(leo);
		
		ArrayList<Doctor> apolloDoctorList = new ArrayList<Doctor>();
		
		apolloDoctorList.add(hari);
		apolloDoctorList.add(ram);
		apolloDoctorList.add(sima);
		
	    Hospital manipal = new Hospital("Manipal", manipalDoctorList);
	    Hospital aiims = new Hospital("Aiims",aiimsDoctorList);
	    Hospital apollo = new Hospital("Apollo",apolloDoctorList);
	    
	    ArrayList<Hospital> HospitalList = new  ArrayList<Hospital>();
	    
	    HospitalList.add(manipal);
	    HospitalList.add(aiims);
	    HospitalList.add(apollo);
	    
		ListIterator<Hospital> itr = HospitalList.listIterator();
		
		while(itr.hasNext()) {
			Hospital hospital = itr.next();
			if(hospital.name.equals("Apollo")) {
				System.out.println("ApolloHospital doctor details");
				 ArrayList<Doctor> doctors = hospital.doctors;
				 System.out.println(doctors);
			}
		}
	}
}
