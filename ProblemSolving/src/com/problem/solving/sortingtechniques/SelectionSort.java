package com.problem.solving.sortingtechniques;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int [] arr = {12, 36, 69, 25, 2, 5, 6, 5, 4, 25, 98, 65, 32, 65, 95, 33, 02, 32, 65, 66};
		int arrayLength = arr.length;
		selectionSort(arr, arrayLength);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] selectionSort(int [] arr, int lengthOfArray) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
 }
