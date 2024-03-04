package com.problem.solving.basicproblems;

import java.util.HashSet;
import java.util.Iterator;

public class Ruff {
	public static void main(String[] args) {
//		Integer [] nums = {1, 5, 6, 6, 8, 6, 9, 5, 6, 3, 7, 5, 2, 9, 11, 12, 55, 66, 22};
//		HashSet<Integer> uniqueValues = new HashSet<Integer>();
//		
//		for(int i=0;i<nums.length;i++) {
//			Boolean isUnique = true;
//			for(int j=0;j<nums.length;j++) {
//				if(i != j && nums[i].equals(nums[j])) {
//					isUnique = false;
//					break;
//				}
//			}
//			if(isUnique) {
//				uniqueValues.add(nums[i]);
//			}
//		}
//		
//		Iterator<Integer> it = uniqueValues.iterator();
//		while(it.hasNext()) {
//			Integer element = it.next();
//			System.out.print(element+", ");
//		}
		
		Integer [] nums = {9, 8, 2, 5, 6};
		
		byte numsLength = (byte)nums.length;
		
		for(int i=0; i< numsLength-1; i++) {
			boolean swapped = false;
			for(int j=0; j<numsLength-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int maxValue = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = maxValue;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
		for(Integer num : nums) {
			System.out.print(num+", ");
		}
		
	}
}
