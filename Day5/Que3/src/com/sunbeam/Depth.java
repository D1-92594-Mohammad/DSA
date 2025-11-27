package com.sunbeam;

public class Depth {
	static class Node {
	    int data;
	    Node left, right;
	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}
	
	public int getNodeLevel(Node root, int key) {
	    return getNodeLevelHelper(root, key, 1); // root is at level 1
	}

	private int getNodeLevelHelper(Node root, int key, int level) {
	    if (root == null) return 0; // node not found

	    if (root.data == key) return level;

	    // Search in left subtree
	    int left = getNodeLevelHelper(root.left, key, level + 1);
	    if (left != 0) return left; // found in left subtree

	    // Search in right subtree
	    return getNodeLevelHelper(root.right, key, level + 1);
	}
}
