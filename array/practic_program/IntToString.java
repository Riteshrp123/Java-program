package com.xworkz.corejava.array.practic_program;

public class IntToString {
	 public static void main(String[] args) {
		
		 String result = intToStr(46);
		 System.out.println("Output is :"+result);
	}
	 
	 public static final int MAX_DIGITS = 10;
	 public static String intToStr(int num) {
		 int i=0;
		 boolean isNegative = false;
		 char[] temp = new char[MAX_DIGITS + 1];
		 if(num<0) {
			 num = num;
			 isNegative = true;
		 }
		 do {
			 temp[i++]=(char)((num % 10) + '0');
			 num/=10;
		 }while(num!=0);
		 StringBuilder b = new StringBuilder();
		 if(isNegative)
			 b.append('-');
		 while(i>0) {
			 b.append(temp[--i]);
		 }
		 return b.toString();
	 }
	
}
