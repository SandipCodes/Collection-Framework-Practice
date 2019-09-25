package com.app.practice.understanding;

import java.util.Stack;

public class StackDemo {

	
	public static void main(String[] args) {
	
		Stack<Integer> stack=new Stack<>();
		
		//pushing the element on stack
		stack_push(stack);
		stack_pop(stack);
		
		stack_push(stack);
		stack_peek(stack);
		
		stack_search(stack,4);
		stack_search(stack,5);
		
	}

	private static void stack_push(Stack<Integer> stack) {
		
		for(int i=0;i<5;i++) {
		 stack.push(i);
			System.out.println(stack);	
		}//for
	}//stack_push()
	
	private static void stack_pop(Stack<Integer> stack) {
	
		for(int i=0;i<5;i++) {
			 if(stack.empty()) {
				 System.out.println("stack is empty.");
				 break;
			 }
			System.out.println(stack.pop());
		}//for
	}//stack_push(Stack<Integer> stack) {
	private static void stack_peek(Stack<Integer> stack) {
		
		if(stack.empty()) {
			 System.out.println("stack is empty.");
		}
		else {
			System.out.println("top element of the stack is:"+ stack.peek());
		}
	}//stack_peek()
	private static void stack_search(Stack<Integer> stack,Integer element) {
	
		Integer index=stack.search(element);
		
		if(index != -1) {
			System.out.println("Element found at :"+ index);
		}
		else {
			System.out.println("Element is not present in the stack.");
		}
	}//stack_search()
}//class
