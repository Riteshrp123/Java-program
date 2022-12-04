package com.xworkz.corejava.exception.unchecked_exception;

public class CallStackDemo{
	static int divide(int a,int b) {
		return a/b;
	}
	static int computeDivision(int a,int b) {
		int result = 0;
		try {
			result = divide(a,b);
		}
		catch (NullPointerException e) {
			System.out.println("caught NullPointerException");
		}
		return result;
	}
	public static void main(String[] args) {
		try {
			System.out.println(computeDivision(20,10));
		}
		catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
		}
		
	}

}
