package com.xworkz.corejava.finalkeyword;

public class FinalKeyWord_Constuctor {
	final static int TEST = 20;
	 static final int TEST1 =30;
	
	
	FinalKeyWord_Constuctor(int TEST){
		System.out.println("I am a constrctor");
		TEST = TEST1;
		
	}

	public static void main(String[] args) {
		FinalKeyWord f1 = new FinalKeyWord ();
		
	 System.out.println(f1.TEST);
	 System.out.println(f1.TEST1);
	 
		
	}
}
