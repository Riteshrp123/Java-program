package com.xworkz.corejava.string.string_methods;

public class StringMethods {
	public static void main(String[] args) {
		
		String s = new String("good ");
		String s1 = new String("morning");
		String s2 = s.concat(s1);

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
}
}