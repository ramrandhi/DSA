package com.leetcode;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = nums1.length;
		int n = nums2.length;
		
		
//		System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int actualLength = m + n;
        int[] sum = new int[actualLength];
        for(int i=0; i<nums1.length;i++) {
            sum[i] = nums1[i];
        }

        for(int j=nums1.length;j<actualLength;j++){
            int k = 0;
            sum[j] = nums2[k];
            k++;
        }

        for(int l=0;l<actualLength-1;l++){
            if(sum[l]>sum[l+1]){
                swap(sum, sum[l], sum[l+1]);
            }
        }

    }

    	public static void swap(int[] sum, int left, int right) {
            int temp = left;
            left = right;
            right = temp;
        }

}
