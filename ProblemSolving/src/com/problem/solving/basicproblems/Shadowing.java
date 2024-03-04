package com.problem.solving.basicproblems;

public class Shadowing {
	static int x = 10;
	public static void main(String[] args) {
		x  = 20;
		System.out.println(x);
		int x = 25; 
		System.out.println(x);
		}

}
