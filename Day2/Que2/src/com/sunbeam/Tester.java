package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		CircularQueue que = new CircularQueue(5);
		que.push(4);
		que.push(3);
		que.push(2);
		que.push(1);
		
		System.out.println("");
		que.display();
		
		que.pop();
		que.pop();
		
		System.out.println("");
		que.display();
		
		que.peek();

	}

}
