package com.arrays;

import java.util.Arrays;

public class SmallestElementinAnArray {
	public static void main(String[] args) {
		int [] arr = {48, 96, 46, 75, 71, 5, 58, 57};
		int n = arr.length-1;
		System.out.println(n);
		System.out.println(Arrays.toString(getSecondOrderElements(n,arr)));
	}
//	public static int smallest(int [] arr) {
//		int min = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		return min;
//	}
	
	 public static int[] getSecondOrderElements(int n, int []a) {
	        int [] returningArray = new int[2];
//	        int max = a[0];
	        int secondMax = 0;
//	        int min = a[0];
	        int secondMin = 0;
//	        for(int i=0;i<a.length;i++){
//	            if(a[i]>max){
//	                max = a[i];
//	            }
//	        }
//	        for(int i=0;i<a.length;i++){
//	            if(a[i]<max && a[i] > 0){
//	                secondMax = a[i];
//	            }
//	        }
//
//	        for(int i=0;i<a.length;i++){
//	            if(a[i]<min){
//	                min=a[i];
//	            }
//	        }
//	        for(int i=0;i<a.length;i++){
//	            if(a[i]>min && a[i]<secondMax){
//	                secondMin = a[i];
//	            }
//	        }  
	        
	        for(int i=0;i<a.length;i++) {
	        	for(int j=0;j<n-i;j++) {
	        		if(a[j]>a[j+1]) {
	        			int temp = a[j];
	        			a[j] = a[j+1];
	        			a[j+1] = temp;
	        		}
	        	}
	        }
	        System.out.println(Arrays.toString(a));
	        
	        secondMax = a[n-1];
	        secondMin = a[1];
	        returningArray[0] = secondMax;
	        returningArray[1] = secondMin;
	        return returningArray;
	    }

}
