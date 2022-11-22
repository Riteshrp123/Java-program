package com.xworkz.corejava.array.multi_dimentional_array;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) 
		{		
			for(int j = 0; j < arr[j].length; j++) {
			if((i==0 & j==0) || (i==1 & j==1) || (i==2 & j==2) || (i==3 & j==3) || (i==4 & j==4))
				{
				System.out.print("*"+" ");
			}
				
			else {
				System.out.print(arr[i][j]+" ");
		}
				System.out.println(" ");
	}
		}	
	}	
}
