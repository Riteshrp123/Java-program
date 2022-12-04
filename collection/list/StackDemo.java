package com.xworkz.corejava.collection.list;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		stack.push('e');
		stack.pop();
		System.out.println(stack.peek());
System.out.println(stack);
}
}
