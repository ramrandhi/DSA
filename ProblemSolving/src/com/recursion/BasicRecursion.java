package com.recursion;

public class BasicRecursion {
	public static void main(String[] args) {
		System.out.println(recursion(6));
	}
	
	public static int recursion(int n) {
		if(n<=1) {
			return n;
		}
		
		return recursion(n-1) + recursion(n-2);
	}
}
