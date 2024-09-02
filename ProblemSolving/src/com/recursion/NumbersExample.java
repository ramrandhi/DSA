package com.recursion;

public class NumbersExample {
	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int num) {
		System.out.println(num);
		if(num<5) {
			print(num+1);
		}
	}
}
