package com.dynamic.programming;

import java.util.HashMap;

public class Fibanacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(30));
	}

	public static int fibonacci(int n) {
		return fibonacci(n, new HashMap<>());
	}

	public static int fibonacci(int n, HashMap<Integer, Integer> decomplex) {
		if (n <= 1) {
			return n;
		}
		
		if(decomplex.containsKey(n)) {
			return decomplex.get(n);
		}
		
		int result = fibonacci(n - 1) + fibonacci(n - 2);
		decomplex.put(n, result);
		return result;
	}

}
