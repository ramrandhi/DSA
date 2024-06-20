package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 1 };
		InsertionSorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void InsertionSorting(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					sortAdjcentArray(arr,j,j-1);
				} else {
					break;
				}
			}
		}
	}

	private static void sortAdjcentArray(int[] arr, int start, int maxlength) {
		for (int j = 0; j <= maxlength; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

}
