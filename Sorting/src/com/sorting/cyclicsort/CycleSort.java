package com.sorting.cyclicsort;

import java.util.Arrays;

public class CycleSort {
	
	// when we have numbers from o to n or n-1 just blindly use cyclic sort
	// it traverses from left to right and when the correct element is not in the right position then it will first put the element
	//     its index

	public static void main(String[] args) {
		int[] arr = {5,4,6,7,9,10,3,2,8,1};
		cyclicSorting(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void cyclicSorting(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}
	
	public static void swap(int[] arr, int start, int replaced) {
		int temp = arr[start];
		arr[start] = arr[replaced];
		arr[replaced] = temp;
	}

}
