package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {5,4,2,3,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void selectionSort(int[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			int last = arr.length-1-i;
			int maxIndex = findMaxIndex(arr, 0,last);
			swap(arr, maxIndex, last);
		}
	}
	
	public static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
	
	public static void swap(int[] arr, int maxIndex, int last) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[last];
		arr[last] = temp;
		
	}
}
