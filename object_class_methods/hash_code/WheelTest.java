package com.xworkz.corejava.object_class_methods.hash_code;

public class WheelTest {
	public static void main(String[] args) {
		
		Wheel carWheel = new Wheel();
		int carWheelHashCode = carWheel.hashcode();
		System.out.println("Hash code of car wheel : "+carWheelHashCode);
		
		Wheel bikeWheel = new Wheel();
		int bikeWheelHashCode = bikeWheel.hashcode();
		System.out.println("Hash code of bike wheel : "+bikeWheelHashCode);
	}

}
