package com.arrays;

import java.util.Arrays;

public class MaxelementInAnArray {

	public static void main(String[] args) {
		int [] arr = {1, 5,6 , 89, 5, 6, 23, 566, 85, 22, 588, 33};
//		findMaxElement(arr);
		reverseArray(arr);
	}
	
	public static void findMaxElement(int[] arr) {
		int max = arr[0];
		for(int i = 0; i<arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
		}
		System.out.print(max);
	}
	
	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
//		int[] reversedArray = new int[arr.length];
//		for(int i=arr.length;i>=arr[0];i--) {
//			reversedArray = arr[i];
//		}
		while(end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
