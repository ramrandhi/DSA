package com.problem.solving.basicproblems;

import java.util.Scanner;

public class PrimeOrNot {
	public static void mian(String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(prime(n));
		}
	}
	
	public static boolean prime(int n) {
		if(n <= 1) {
			return false;
		}
		int d = 2;
		while(d*d <= n) {
			if(n%d == 0) {
				return false;
			}
			d++;
		}
		return d*d > n;
	}
}
