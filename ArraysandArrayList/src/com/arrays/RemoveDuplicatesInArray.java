package com.arrays;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,2,3,3,4,5};
		int n = arr.length;
		System.out.println(removeDuplicates(arr,n));
		
	}
	
	private static int removeDuplicates(int []arr, int n) {
		int len = 0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				len = len+1;
			}
		}
		return len;
	}

}
