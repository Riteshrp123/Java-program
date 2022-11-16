package com.xworkz.corejava.aptitude_program;

public class PalindromString {
	public static void main(String[] args) {
		
		String w="malayalam";
		String rev = "";
		for(int i=w.length()-1;i>=0;i--) {
			rev =rev+w.charAt(i);
		}
		if(w.equals(rev)) {
			System.out.println("palindram String");
		}
		else {
			System.out.println("not palindram String");
		}
			
	}

}
