package com.xworkz.corejava.block;

public class BlocksDemo {
	  static {
		  System.out.println("I am a SIB1");
		  
	  }
	  static {
		  System.out.println("I am a SIB2");
	  }
	  
	  {
			System.out.println("I am IIB1");
		}
		
		{
			System.out.println("I am IIB2");
		}
		
		  BlocksDemo(){
			   System.out.println("I am a Constructor");
		   }
		public static void main(String[] args) {
			BlocksDemo block = new BlocksDemo();
			
		}
	  
	  

}
