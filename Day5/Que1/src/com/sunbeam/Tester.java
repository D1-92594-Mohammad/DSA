package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		BinarySearch bstree = new BinarySearch();
		
		bstree.addNode(10);
		bstree.addNode(20);
		bstree.addNode(30);
		bstree.addNode(12);
		bstree.addNode(14);
		bstree.addNode(1);
		
		System.out.println(bstree.search(12));

	}

}
