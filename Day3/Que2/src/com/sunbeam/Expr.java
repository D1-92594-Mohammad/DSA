package com.sunbeam;

import java.util.Stack;

public class Expr {
	
	public static int PostfixEval(String expr){
	    Stack<Integer> st = new Stack<>();
	    int n = expr.length();

	    for(int i = 0; i < n; i++){
	        char ch = expr.charAt(i);

	        if(Character.isDigit(ch)){
	            int num = 0;
	            while(i < n && Character.isDigit(expr.charAt(i))){
	                num = num * 10 + (expr.charAt(i) - '0');
	                i++;
	            }
	            st.push(num);
	            i--;
	        }else if(ch == ' '){
	            continue;
	        }else{
	            int b = st.pop();
	            int a = st.pop();
	            st.push(apply(a,b,ch));
	        }
	    }
	    return st.pop();
	}
	
	public static int PrefixEval(String expr){
	    Stack<Integer> st = new Stack<>();
	    int n = expr.length();

	    for(int i = n - 1; i >= 0; i--){
	        char ch = expr.charAt(i);

	        if(Character.isDigit(ch)){
	            int num = 0;
	            int place = 1;

	            while(i >= 0 && Character.isDigit(expr.charAt(i))){
	                num = (expr.charAt(i) - '0') * place + num;
	                place *= 10;
	                i--;
	            }
	            st.push(num);
	            i++;
	        }else if(ch == ' '){
	            continue;
	        }else{
	            int a = st.pop();
	            int b = st.pop();
	            st.push(apply(a,b,ch));
	        }
	    }
	    return st.pop();
	}

	public static int apply(int a,int b,char op){
	    switch(op){
	        case '+': return a+b;
	        case '-': return a-b;
	        case '*': return a*b;
	        case '/': return a/b;
	        case '%': return a%b;
	    }
	    return 0;
	}
	
	public static void main(String[] args) {
		int postfix = PostfixEval("12 3 4 * + 6 -");
		System.out.println(postfix);
		
		System.out.println(PrefixEval("- + 12 * 3 4 6"));
	}
}
