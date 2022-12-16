package com.xworkz.corejava.collection.set.tree_set;

import java.util.TreeSet;

public class TreeSetWithString {
	public static void main(String[] args) {
		
		
		TreeSet ts = new TreeSet(new StringComparator());
		ts.add("laptop");
		ts.add("desktop");
		ts.add("ram");
		ts.add("ssd");
		ts.add("hdd");
		
		System.out.println(ts);
	}

}
