package com.xworkz.corejava.collection.set.tree_set;

import java.util.Comparator;

public class MyComparator implements Comparator<String>  {
	
      @Override
	public int compare(String o1, String o2) {
    	  String s1 = o1.toString();
    	  String s2 = o2.toString();
		return s1.compareTo(s2) ;
	}

}
