package com.arrays;

import java.util.Arrays;

public class SecondOrderElementsOptimal {
	
	public static void main(String[] args) {
		int [] a = {3,4,2, 5, 5};
		int n = a.length;
		System.out.println(n);
		int firstArray = getMaxSecondOrderElement(a,n);
		int secondArray = getMinsecondOrderelement(a,n);
		int [] arr = {firstArray, secondArray};
		System.out.println(Arrays.toString(arr));
	}
	
	public static int getMaxSecondOrderElement(int[]a, int n) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				secondMax = max;
				max = a[i];
			}else if(a[i]>secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}
		return secondMax;
	}
	
	public static int getMinsecondOrderelement(int[]a, int n) {
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				secondMin = min;
				min = a[i];
			}else if(a[i] < secondMin && a[i] != min) {
				secondMin = a[i];
			}
		}
		return secondMin;
	}

}
