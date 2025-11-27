package com.sunbeam;

public class LinearSearch {
	
	public static int lastOccurrence(int[] arr,int key){
	    int index = -1;

	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == key){
	            index = i;
	        }
	    }
	    return index;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,4,1,4,15,1,4,5,6};
		int result = lastOccurrence(arr,1);
		System.out.println(result);

	}

}
