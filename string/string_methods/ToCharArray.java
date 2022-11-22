package com.xworkz.corejava.string.string_methods;

public class ToCharArray {
	public static void main(String[] args) {
		
		String s ="Ritesh pradhan";
		
		char[] s1 = s.toCharArray();
		
		for(char b : s1) {
			System.out.println(b);
		}
	}

}
