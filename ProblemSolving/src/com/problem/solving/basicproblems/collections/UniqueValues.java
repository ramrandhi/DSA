package com.problem.solving.basicproblems.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class UniqueValues {
	public static void main(String[] args) {
		Integer [] nums = {1, 5, 6, 6, 8, 6, 9, 5, 6, 3, 7, 5, 2, 9, 11, 12, 55, 66, 22};
		List<Integer> repeatedElements = new ArrayList<Integer>();
		List<Integer> uniqueElements = new ArrayList<Integer>();
//		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(nums));
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			Integer element = it.next();
//			System.out.print(element+" ");
//		}
		for(int i=0; i<nums.length;i++) {
			boolean isUnique = true;
			for(int j=0;j<nums.length;j++) {
				if(i != j && nums[i] == nums[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				uniqueElements.add(nums[i]);
			} else {
				repeatedElements.add(nums[i]);
			}
		}
		
		Iterator<Integer> it = repeatedElements.iterator();
		while(it.hasNext()) {
			Integer element = it.next();
			System.out.print(element+", ");
		}
		System.out.println();
		System.out.println("++++++++++");
		System.out.println();
		Iterator<Integer> lt = uniqueElements.iterator();
		while(lt.hasNext()) {
			Integer element = lt.next();
			System.out.print(element+", ");
		}
	}
}