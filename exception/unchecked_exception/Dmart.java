package com.xworkz.corejava.exception.unchecked_exception;


public class Dmart {
	//new Product("Atta",300.00) {
	Product[] products = {new Product("Mustad oil",150.00),
	                      new Product("Ditergent",100.00),
	                      new Product("Atta",300.00),
	                      new Product("facewash",50.00),
	                      new Product("shampo",30.00)};
	
	      void search(Product product) {
	    	  
	    	  boolean isProductAvailable = false;
	    	  
	    	  for(int i = 0; i < products.length; i++) {
	    		  if(products[i].equals(product)) {
	    			  isProductAvailable = true;
	    			  }
	    		  }
	    	  if(isProductAvailable) {
	    		 System.out.println("Product found."); 
	    	  }
	    	  else {
	    		  DmartException dmartException =
	    				  new DmartException();
	    			  throw dmartException;
	    		  
	    		  }
	    	  }
}
