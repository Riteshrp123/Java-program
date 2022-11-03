package com.xworkz.corejava.constuctor.parametrized_constuctor;

public class ParametrizedContructor {
	
	public static void main(String[] args) {
		
		Televison t1 = new Televison("Samsung",10000.700);
		System.out.println(t1.brand);
		System.out.println(t1.price);
		
		Televison sony = new Televison("Sony",20000.600);
		System.out.println(sony.brand);
		System.out.println(t1.price);
			
	}

}
