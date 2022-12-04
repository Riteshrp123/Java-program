package com.xworkz.corejava.string.string_buffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("black");
		System.out.println(sb.capacity());
		
		sb.append("dark night rise");
		System.out.println(sb.capacity());
	}

}
