package com.udemy.dataStructures.recursion;

public class BasicRecursion {
	
	public static void main(String[] args) {
		int n = 10;
		recursion(n);
	}
	public static void recursion(int n) {
		int a = 0;
		if(a == n) {
			System.out.println("reached");
		} else {
			recursion(n-1);
		}
	}
}
