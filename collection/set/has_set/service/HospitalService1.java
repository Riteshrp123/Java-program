package com.xworkz.corejava.collection.set.service;

import com.xworkz.corejava.collection.set.exception.HospitalException;
import com.xworkz.corejava.collection.set.model.HospitalDTO1;

public interface HospitalService1 {
	
	void add(HospitalDTO1 apollo) throws HospitalException;
	
	 HospitalDTO1 getHospital(String hospitalName) throws HospitalException;
}
