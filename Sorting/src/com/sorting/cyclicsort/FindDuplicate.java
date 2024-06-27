package com.sorting.cyclicsort;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		int duplicate = findDuplicateElement(arr);
		System.out.println(duplicate);
		;
	}

	public static int findDuplicateElement(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			if(arr[i] != i+1){
				int correct = arr[i]-1;
			}
		}
		return -1;
	}

	public static void swap(int[] arr, int start, int index) {
		int temp = arr[start];
		arr[start] = arr[index];
		arr[index] = temp;
	}

}
