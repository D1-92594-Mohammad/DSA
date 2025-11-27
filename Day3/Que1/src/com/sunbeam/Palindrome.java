package com.sunbeam;

public class Palindrome {
	
	public static boolean usingTwoPointer(String s){
	    int l = 0, r = s.length() - 1;
	    while(l < r){
	        if(s.charAt(l) != s.charAt(r)) return false;
	        l++;
	        r--;
	    }
	    return true;
	}
	
	public static boolean isPalindrome(String s){
	    String rev = "";
	    for(int i = s.length() - 1; i >= 0; i--){
	        rev += s.charAt(i);
	    }
	    return s.equals(rev);
	}
	
	public static boolean usingRecursion(String s){
	    return check(s,0,s.length()-1);
	}

	private static boolean check(String s,int left,int right){
	    if(left >= right) return true;
	    if(s.charAt(left) != s.charAt(right)) return false;
	    return check(s,left+1,right-1);
	}
	
	public static boolean usingStack(String s){
	    java.util.Stack<Character> st = new java.util.Stack<>();
	    for(char c : s.toCharArray()) st.push(c);

	    for(char c : s.toCharArray()){
	        if(c != st.pop()) return false;
	    }
	    return true;
	}


	public static void main(String[] args) {
		System.out.println("isPalindrome: " +isPalindrome("racecar"));
		System.out.println("isPalindrome: " +isPalindrome("racr"));
		
		System.out.println("isPalindrome: " +usingTwoPointer("racecar"));
		System.out.println("isPalindrome: " +usingTwoPointer("racer"));
		
		System.out.println("isPalindrome: " +usingRecursion("racecar"));
		System.out.println("isPalindrome: " +usingRecursion("raceca"));
		
		System.out.println("isPalindrome: " +usingStack("racecar"));
		System.out.println("isPalindrome: " +usingStack("racec"));

	}

}
