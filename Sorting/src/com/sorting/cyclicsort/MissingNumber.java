package com.sorting.cyclicsort;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {0,3,1,4,5};
		missing(arr);
		System.out.println(Arrays.toString(arr));
	}
		private static void missing(int[] arr) {
			int i =0;
			while(i<=arr.length) {
				int current = arr[i];
				if(arr[i] != arr[current]) {
					swap(arr,i,current);
				} else {
					i++;
				}
			}
		}
		
		private static void swap(int[] arr, int start, int end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
}
