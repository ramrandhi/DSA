package com.arrays;

public class CheckIfArrayIsSortedBrute {

	public static void main(String[] args) {
		int[] a = {1,5,3,6,8, 4, 9};
		System.out.println(CheckIfArrayIsSorted(a));;
	}
	
	public static boolean CheckIfArrayIsSorted(int[] arr) {
		int n = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
