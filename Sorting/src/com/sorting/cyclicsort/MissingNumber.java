package com.sorting.cyclicsort;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 1, 4, 5 };
		int num = missing(arr);
		System.out.println(num);
	}

	private static int missing(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int current = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[current]) {
				swap(arr, i, current);
			} else {
				i++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j) {
				return j;
			}
		}
		return arr.length;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
