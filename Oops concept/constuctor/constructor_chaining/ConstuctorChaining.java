package com.xworkz.corejava.constuctor.constructor_chaining;

    public class ConstuctorChaining{
    	public static void main(String[] args)	{
    		
		Watch watch = new Watch();
		System.out.println(watch.name);
		 
        Watch samsung = new Watch("samsung",500.80,"blue","digital");
        
        
    	System.out.println("watch name :"+ samsung.name);
    	System.out.println("watch price :"+ samsung.price);
    	System.out.println("watch color :"+ samsung.colour);
    	System.out.println("watch type :"+ samsung.type);
    	
    	
    	
	}
	

}
