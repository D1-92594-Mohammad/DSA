package com.sunbeam;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {
	
	public static void countOccurence(String s) {
		Map<String,Integer> mpp = new HashMap<>();
		String words[] = s.split(" ");
		for(String w : words) {
			if(mpp.containsKey(w)) {
				mpp.put(w, mpp.getOrDefault(w, 0) + 1);
			}
			else {
				mpp.put(w,1);
			}
		}
		
		for(String w: mpp.keySet()) {
			System.out.println(w + " : " + mpp.get(w));
		}
	}

	public static void main(String[] args) {
		
		countOccurence("This is my count occurence program");

	}

}
