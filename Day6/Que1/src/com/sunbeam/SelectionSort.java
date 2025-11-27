package com.sunbeam;

public class SelectionSort {
	
	public static void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

	public static void main(String[] args) {
		int arr[] = {4,5,10,193,19,394,22};
		
		insertionSortDesc(arr);
		
		System.out.println("Desc array: ");
		for(int i : arr) {
			System.out.print(" " +i);
		}

	}

}
