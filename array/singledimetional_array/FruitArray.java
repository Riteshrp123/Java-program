package com.xworkz.corejava.array.singledimetional_array;

public class FruitArray {
	public static void main(String[] args) {
		
		String[] Fruits = {"orange","mango","banana","chiku","apple"};
		
		String fruit = "apple"; 
		boolean isInArray = false;
		for(String element:Fruits) {
		if(fruit==element) {
			isInArray = true;
			break;
		}
	}
		if(isInArray) {
		System.out.println("The fruit is present in the array");
	}
		else {
			System.out.println("The fruit is not present in the array");
		}
	}
}
