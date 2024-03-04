package com.arrays;

public class ArrayBinarySearch {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10,14,15,58,98,225,3654};
		int index = 58;
		int indexValue = findIndex(arr,index);
		System.out.println(indexValue);
	}
	
	public static int findIndex(int [] a, int index) {
//		int arrLength = a.length;
		int start = 0;
		int end = a.length-1;
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(index > a[mid]) {
				start = a[mid]+1;
			}else if(index < a[mid]) {
				end = a[mid];
			}else {
				return mid;
			}
		}
		return -1;
	}

}
