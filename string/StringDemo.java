package com.xworkz.corejava.string;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Xworkz";
		String str1 = "Xworkz";
		String str2 = "Java"; 
		str1 = "Web";
		System.out.println(str==str1);
		
		String s1 = new String("sql");
		String internOfs1 = s1.intern();
		
		System.out.println(s1.equals(internOfs1));
		System.out.println(s1==internOfs1);
		
		String s2 = "sql";
		
		System.out.println(s2==internOfs1);
		
		String s3 = new String("sql");
		
		System.out.println(s1 == s3);
	}

}
