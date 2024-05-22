package com.problem.solving.basicproblems;

import java.util.ArrayList;

public class HCFofTwoNumbers {

	public static void main(String[] args) {
		int firstValue = 15;
		int secondValue = 18;
		int hcf = hcfOfTwoNumbers(firstValue, secondValue);
		System.out.println(hcf);
	}
	static int hcfOfTwoNumbers(int firstValue, int secondValue) {
		int smallest = firstValue > secondValue ? secondValue : firstValue;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i<= smallest; i++) {
			if(firstValue%i == 0 && secondValue%i == 0) {
				arr.add(i);
			}
		}
		return arr.get(arr.size()-1);
	}
}
