package com.sunbeam;

public class Successor {
	
	static class Node {
	    int data;
	    Node left, right;
	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}
	
	public Node inorderSuccessor(Node root, Node target) {
	    if (target == null) return null;

	    // Case 1: If right subtree exists, successor is leftmost node of right subtree
	    if (target.right != null) {
	        Node current = target.right;
	        while (current.left != null) {
	            current = current.left;
	        }
	        return current;
	    }

	    // Case 2: Traverse from root to find the successor
	    Node successor = null;
	    Node current = root;
	    while (current != null) {
	        if (target.data < current.data) {
	            successor = current; // potential successor
	            current = current.left;
	        } else if (target.data > current.data) {
	            current = current.right;
	        } else {
	            break; // target found
	        }
	    }
	    return successor;
	}


}
