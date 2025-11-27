package com.sunbeam;

public class LS {
	
	public static int nthOccurrence(int[] arr,int key,int n){
	    int count = 0;

	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == key){
	            count++;
	            if(count == n){
	                return i;
	            }
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,4,1,4,15,1,4,5,6};
		int result = nthOccurrence(arr, 1, 3);
		System.out.println(result);

	}

}
