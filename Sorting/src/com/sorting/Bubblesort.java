package com.sorting;

/*
 * comparing the adjcent elements and sorting the array
 * 
 * 
 * 
 * 
 */

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr = {3,4,6,2,5,1};
		int [] sortedArray = bubbleSort(arr);
		for(int n : sortedArray) {
			System.out.print(n + " ");
		}
	}
	
	static int[] bubbleSort(int[] nums) {
//		int[] arr = new int[nums.length];
		
		for(int row = 0; row < nums.length-1; row++) {
			for(int j = 0; j<nums.length-1-row; j++)
			if(nums[j] > nums[j+1]) {
				int temp = nums[j+1];
				nums[j+1] = nums[j];
				nums[j] = temp;
			}
		}
		return nums;
	}

}
