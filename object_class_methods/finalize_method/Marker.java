package com.xworkz.corejava.object_class_methods.finalize_method;

public class Marker {
	String brand;
	
	public Marker(String brand) {
		this.brand = brand;
	}

	public void finalize() throws Throwable {
		System.out.println("Finalize method executed.");
	}
	
	public String toString() {
		return "Marker [brand=" + brand + "]";
	}
	
}
