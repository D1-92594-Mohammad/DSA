package com.sunbeam;

import com.sunbeam.List.Node;

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
	public List () {
		head = null;
	}
	
	public void insert(int value) {
		Node newnode = new Node(value);
		if(head == null || value <= head.data) {
			newnode.next = head;
			head = newnode;
			return;
		}
		Node trav = head;
		while(trav.next != null && trav.next.data < value  ) {
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


