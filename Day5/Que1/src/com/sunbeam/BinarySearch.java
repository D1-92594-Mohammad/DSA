package com.sunbeam;

public class BinarySearch {
	static class Node {
	    int data;
	    Node left, right;

	    Node(int data){
	        this.data = data;
	        left = right = null;
	    }
	}
	private Node root;
	
	public void addNode(int value) {
		Node newnode = new Node(value);
		if(root == null) {
			root = newnode;
			return;
		}		
		Node trav = root;
		while(true) {
			if(value < trav.data) {
				if(trav.left == null) {
					trav.left = newnode;
					return;
				}
				else {
					trav = trav.left;
				}
			}
			else {
				if(trav.right == null) {
					trav.right = newnode;
				}
				else {
					trav = trav.right;
					return;
				}
			}
			
		}
	}


	public Node search(int key) {
		return search(root, key);
	}
	

	private Node search(Node root, int key){
	    if(root == null || root.data == key){
	        return root;
	    }

	    if(key < root.data){
	        return search(root.left, key);
	    } else {
	        return search(root.right, key);
	    }
	}
}



