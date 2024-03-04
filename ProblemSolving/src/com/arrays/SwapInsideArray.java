package com.arrays;

import java.util.Arrays;

public class SwapInsideArray {
	
	public static void mian(String [] args) {
		int [] arr = {1, 2, 3, 5, 6, 7, 8, 9 };
		swap(arr,2,4);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int [] arr, int index1, int index2) {
		int temp = index1;
		index1 = index2;
		index2 = index1;
	}

}
