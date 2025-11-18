package com.sunbeam;

public class Stack {
	private int top;
	private int[] arr;
	private int SIZE;
	public Stack(int size) {
		top = -1;
		SIZE = size;
		arr = new int[size];
	}
	
	public void push(int value) {
		if(!isFull()) {
			top++;
			arr[top] = value;
			System.out.println("Pushed " +value);
		}
		else {
			System.out.println("Cannot push. Stack is full");
		}
	}
	
	public int pop(){
		int temp = -1;
		if(!isEmpty()) {
			temp = arr[top];
			System.out.println("Popped " +arr[top]);
			top--;
		}
		else {
			System.out.println("Stack is empty");
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			temp = arr[top];
		}
		return temp;
	}
	
	public void display() {
		System.out.println("");
		System.out.println("Stack :: ");
		for(int i = 0; i <= top; i++) {
			System.out.println("Element at " +i +" index is " +arr[i]);
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE;
	}
}
