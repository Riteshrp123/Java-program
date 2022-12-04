package com.xworkz.corejava.wrapper_class;

public class Unboxing {
	public static void main(String[] args) {
		
		//implicit
		String s = "10";
		System.out.println(s);
		
		//explicit
		Integer n = new Integer(100);
		int s1 = n.intValue();
		int s2 =n;
		System.out.println(n);
		
	}

}
