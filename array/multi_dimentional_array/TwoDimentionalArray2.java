package com.xworkz.corejava.array.multi_dimentional_array;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		
		int[][] num = new int[4][4];
		int n = 20;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = n;
				n+=5;
			}
		}
		
		for(int i = 0; i < num.length; i++) 
		{		
			for(int j = 0; j < num[i].length; j++) {
			//if((i==0 & j==0) || (i==1 & j==1) || (i==2 & j==2) || (i==3 & j==3) || (i==4 & j==4))
				System.out.print(num[i][j]+" ");
				
				
				//System.out.print(arr[i][j]+" ");
		}
			
				System.out.println();
	}
		}	
	}	
