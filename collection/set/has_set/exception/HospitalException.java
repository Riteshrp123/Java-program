package com.xworkz.corejava.collection.set.exception;

public class HospitalException extends Exception {
	
	@Override
	public String toString() {
		return "No content found in Hospital details in Request";
		
	}
	
   @Override
public String getMessage() {
	return "Hospital not found";
  }
}
