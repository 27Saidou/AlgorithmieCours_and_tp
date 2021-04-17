package com.algo.techno;

public class Stack_Algorithmie {

	int[] stack = new int[5];
	int top = 0;

	public void push(int data) {
		if (top == 5) {
			System.out.println("stack rempli");
		} else {
			stack[top] = data;
			top++;
		}
	}
public int size() {
	
	return top;
}
	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack est vide");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int n : stack) {
			System.out.println(n + " ");
		}
		System.out.println("");
	}
}
