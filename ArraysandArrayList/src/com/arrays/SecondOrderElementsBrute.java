package com.arrays;

import java.util.Arrays;

public class SecondOrderElementsBrute {

	public static void main(String[] args) {
		int [] a = {3,4,2,5};
		int n = a.length;
		System.out.println(Arrays.toString(getsecondOrderElements(a,n)));
	}
	
	private static int[] getsecondOrderElements(int[] a, int n) {
		int [] arr = new int[2];
		int length = n;
		int max = 0;
		int secondMax = a[0];
		int min = 0;
		int secondMin = a[0];
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		for(int i=0;i<length;i++) {
			if(a[i]>secondMax && a[i] != max) {
				secondMax = a[i];
			}
			if(a[i]<secondMin && a[i] != min){
				secondMin = a[i];
			}
		}
		System.out.println(secondMax);
		System.out.println(secondMin);
		arr[0] = secondMax;
		arr[1] = secondMin;
		return arr;
	}
}
