package com.xworkz.corejava.aptitude_program;

public class FibonacciCalculater {
	public static int fibonacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
			
		}
		int fibo1 = 1,fibo2 = 1,fibonacci =1;
		
		for(int i = 3;i <= number;i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			
			}
		
		return fibonacci;
		
	}
	
	public static void main(String[] args) {
		int number = 10;
		System.out.println("fibonacci number up to" + number + "number");
		for(int i = 1;i <= number; i++) {
		int fib = fibonacci(i);
		System.out.print(fib + " ");
		
		}
		
	}

}
