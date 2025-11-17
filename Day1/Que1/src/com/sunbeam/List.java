package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
		
	}
	
	private Node head;
	
	public void insertStart(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void insertAfter(int value,int pos) {
		Node newnode = new Node(value);
		Node trav = head;
		for(int i = 1; i < pos ; i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
	}
	
	public void insertBefore(int value,int pos) {
		Node newnode = new Node(value);
		Node trav = head;
		for(int i = 1 ; i < pos - 1; i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			System.out.print(" " +trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}


