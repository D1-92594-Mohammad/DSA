package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
//		Stack st = new Stack();
//		st.push(1);
//
//		st.push(2);
//		st.push(3);
//		st.display();
//		
//		st.pop();
//		st.display();
//		
		
//		System.out.println("Top element: " +st.peek());
		
		Queue q = new Queue();
		q.push(10);
		q.push(20);
		q.push(30);
		
		q.display();
		
		q.pop();
		q.display();
		
		System.out.println(q.peek());
	}

}
