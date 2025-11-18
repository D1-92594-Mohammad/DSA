package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		Stack st = new Stack(arr.length);
		
		for(int i = 0 ; i < arr.length; i++) {
			st.push(arr[i]);
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			int x = st.pop();
			arr[i] = x;
		}
		
		
		System.out.println("Reversed array :: ");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(" " +arr[i]);
		}
		

	}

}
