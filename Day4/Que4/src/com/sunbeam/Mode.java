package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mode {
	
	public static int mode(int[] arr){
		Map<Integer,Integer> mpp = new HashMap<>();
		for(int i : arr) {
			if(mpp.containsKey(i)) {
				mpp.put(i, mpp.getOrDefault(i, 0) + 1);
			}
			else {
				mpp.put(i, 1);
			}
		}
		
		
	    int mode = -1;
	    int maxCount = 0;
	    
	    for(Entry<Integer, Integer> e : mpp.entrySet()) {
	    	if(e.getValue() > maxCount) {
	    		
	    		mode = e.getKey();	    
	    		maxCount = e.getValue();
	    		}
	    }
	    
	    return mode;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,4,1,4,15,1,4,5,6};
		
		int res = mode(arr);
		System.out.println(res);

	}

}
