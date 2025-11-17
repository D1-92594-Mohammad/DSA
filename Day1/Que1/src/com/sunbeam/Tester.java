package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		List li = new List();
		
		li.insertStart(40);
		li.insertStart(30);
		li.insertStart(20);
		li.insertStart(10);
		
		li.insertAfter(100, 2);
		li.insertAfter(200, 2);

		li.display();
	}

}
