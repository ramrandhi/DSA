package com.recursion;

public class BinarySearchUsingRecursion {
	
	/*
	 * 	why start and end passed as an argument to search function but not the mid?
	 * 
	 * -> Because we require start and end for the recursive function call and mid can be called inside the function anyway it can calculate 
	 * 	that start and stop only.
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 77, 88, 99, 555 };
		int target = 77 ;
		System.out.println(search(arr, target, 0, arr.length - 1));
	}

	public static int search(int[] arr, int target, int start, int end) {
		int mid = start + (end-start)/2;
		if(start>end) {  // edge case to not exceed start over to end
			return -1;
		}
		
		if(arr[mid] == target) {
			return mid;
		} else if(target< arr[mid]) {
			return search(arr, target, start, mid-1);
		} else {
			return search(arr, target, mid+1, end);
		}
	}

}
