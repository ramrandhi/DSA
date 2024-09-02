package com.dynamic.programming;

import java.util.HashMap;

public class Tribonacci {
	public static void main(String[] args) {
		System.out.println(tribonacci(10));
	}
	
	public static int tribonacci(int n) {
		return tribanocci(n, new HashMap<>());
	}
	
	public static int tribanocci(int n, HashMap<Integer, Integer> decomplex) {
		if(n<=1) {
			return 0;
		}
		 if(n == 2) {
			 return 1;
		 }
		 
		 if(decomplex.containsKey(n)) {
			 return decomplex.get(n);
		 }
		
		int result = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
		decomplex.put(n, result);
		return result;
	}
}
