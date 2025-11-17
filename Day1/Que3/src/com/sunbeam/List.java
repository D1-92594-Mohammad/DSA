package com.sunbeam;

public class List {
	static class Node {
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	public List() {
		tail = null;
	}
	
	public void insert(int value) {
		Node newnode = new Node(value);
		if(tail == null) {
			tail = newnode;
			newnode.next = tail;
			
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		
	}
    public void display() {
        if(tail == null) return;
        Node trav = tail.next;
        do {
            System.out.print(trav.data + " ");
            trav = trav.next;
        } while(trav != tail.next);
        System.out.println("");
    }
}
