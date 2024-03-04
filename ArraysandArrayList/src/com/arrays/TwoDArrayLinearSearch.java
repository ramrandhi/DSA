package com.arrays;

import java.util.Arrays;

public class TwoDArrayLinearSearch {
	public static void main(String[] args) {
		int [][] arr = {
				{2,3,4},
				{5,6},
				{9,10,1}
		};
		int target = 4;
		int [] a = searchElementIn2DArray(arr, target);
		System.out.println(Arrays.toString(a));
	}
	public static int[] searchElementIn2DArray(int[][]arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(target == arr[i][j]) {
					return new int [] {i,j};
				}
			}
		}
		
		return new int [] {-1,-1};
	}

}
