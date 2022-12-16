package com.xworkz.corejava.collection.set.tree_set;

import java.util.TreeSet;

public class TreeSetWithStringBuffer {
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> birds = new TreeSet<>(new StringBufferComparator());
		
		birds.add(new StringBuffer("parrot"));
		birds.add(new StringBuffer("crow"));
		birds.add(new StringBuffer("pigeon"));
		birds.add(new StringBuffer("butterflay"));
		birds.add(new StringBuffer("egale"));
		
		System.out.println(birds);
	}

}
