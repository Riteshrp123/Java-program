package com.xworkz.corejava.object_class_methods.finalize_method;

public class FinalizeTest {
   public static void main(String[] args) {
	
	   Marker marker = new Marker("Camlin");
	   marker = null;
	   System.gc();
	   System.out.println(marker);
}
}
