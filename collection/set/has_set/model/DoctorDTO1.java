package com.xworkz.corejava.collection.set.model;

public class DoctorDTO1 {
	private String name;
	private String specialization;
	
	public DoctorDTO1() {
	}
  
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "DoctorDTO1 [name=" + name + ", specialization=" + specialization + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 34;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorDTO1 other = (DoctorDTO1) obj;
		if(name == null) {
			if (other.name != null) {
				return false;
			}else if (!name.equals(other.name))
				return false;
			if (specialization == null) {
				if(other.specialization !=null) {
					return false;
				}else if (!specialization.equals(other.specialization))
					return false;
				return true;
		}
		}
		return false;
	}
}
