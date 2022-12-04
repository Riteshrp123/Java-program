package com.xworkz.corejava.collection.list;

public class Doctor {
	
	String name;
	String id;
	String specialists;
	
	public  Doctor(String name,String id,String specialists) {
		this.name = name;
		this.id = id;
		this.specialists = specialists;
		
	}

	//@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialists=" + specialists + "]";
	}
	
}
