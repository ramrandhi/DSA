package com.arrays;

import java.util.Arrays;

public class swapelementsInArray {
	public static void main(String[] argts) {
		int [] arr = {1, 2, 3, 4, 5, 7, 9};
		swap(arr,1,2);
		System.out.println(Arrays.toString(arr));
 	}
	
	public static void swap(int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
