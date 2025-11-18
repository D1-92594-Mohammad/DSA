package com.sunbeam;

public class CircularQueue {
	private int[] arr;
	private int size,count,front,rear;
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = -1;
		count = 0;
	}
	
	public boolean isFull() {
		return count == size;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void push(int value) {
		if(!isFull()) {
			rear = (rear + 1) % size;
			arr[rear] = value;
			count++;
		}
		else {
			System.out.println("Cannot push. Queue is full.");
		}
	}
	
	public int pop() {
		int temp = -1;
		if(!isEmpty()) {
			temp = arr[front];
			front = (front + 1) % size;
			count--;
		}
		else {
			System.out.println("Cannot pop. Queue is empty");
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(!isEmpty()) {
			temp = arr[front];
		}
		else {
			System.out.println("Queue is empty.");
		}
		return temp;
	}
	
	public void display() {
		for(int i = 0; i < count ; i++) {
			int index = (front + i) % size;
			System.out.print(" " +arr[index]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
