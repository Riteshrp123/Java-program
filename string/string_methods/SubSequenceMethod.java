package com.xworkz.corejava.string.string_methods;

public class SubSequenceMethod {
	public static void main(String[] args) {
		
		String s = "Ram is boy";
		String s1 = "Black Adam";
		
		System.out.println(s.subSequence(3, 8));
		System.out.println(s.substring(3));
		System.out.println(s1.subSequence(3,7));
		
	}

}
