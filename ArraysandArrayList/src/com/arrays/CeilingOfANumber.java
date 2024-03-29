package com.arrays;

public class CeilingOfANumber {

	public static void main(String[] args) {
		int[] arr = {12,11,10,8,6,3,2,1,-3,-5};
		int target = 7;
		int nearestNumber = ceilingOfAnumber(arr,target);
		System.out.println(nearestNumber);

	}
	
	public static int ceilingOfAnumber(int [] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(arr[start]>arr[end]) {
			int mid = start + (end-start)/2;
			if(target > arr[mid]) {
				end = arr[mid-1];
			}else if(target < arr[mid]) {
				start = arr[mid+1];
			} else {
				return arr[mid];
			}
		}
		return 0;
	}

}
