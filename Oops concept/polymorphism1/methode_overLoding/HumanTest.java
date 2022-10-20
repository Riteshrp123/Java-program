package com.xworkz.polymorphism1.methode_overLoding;

public class HumanTest {
	
	public static void main(String[] args) {
		
		Human ritesh = new Human();
		
		Unknown unknown = new Unknown();
		Friend friend = new Friend();
		ritesh.speak(unknown);
	    ritesh.speak(friend);
	    
	}

}
