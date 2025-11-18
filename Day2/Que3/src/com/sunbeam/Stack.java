package com.sunbeam;

public class Stack {
	
	static class Node {
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	private int top;
	
	public Stack () {
		head = null;
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode;
		}
		System.out.println("Pushed " +newnode.data +" in the stack");
	}
	
	public int pop() {
		Node trav = head;
		while(trav.next.next != null) {
			trav = trav.next;
		}
		int temp = trav.next.data;
		System.out.println("Popped : " +trav.next.data);
		trav.next = null;
		return temp;
	}
	public int peek() {
		Node trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		return trav.data;
	}
	
	public void display() {
		
		Node trav = head;
		System.out.println("Forward traversal :: ");
		while(trav != null) {
			System.out.print(" " +trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

}


class Queue {
	static class Node {
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public Queue() {
		tail = null;
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void push(int value) {
		Node newnode = new Node(value);
		if(head == null && tail == null) {
			head = tail = newnode;
		}
		else {
			tail.next = newnode;
			tail = newnode;
			
		}
	}
	
	public int pop() {
		int temp = head.data;
		head = head.next;
		return temp;
	}
	
	public int peek() {
		return head.data;
	}
	
	public void display() {
		Node trav = head;
		System.out.println("Forward traversal :: ");
		while(trav != null) {
			System.out.print(" " +trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
}





















