package com.problem.solving.basicproblems.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueValuesUsingCollections {
	public static void main(String[] args) {
		Integer [] nums = {1, 1, 5, 6, 6, 8, 6, 9, 5, 8, 6, 3, 7, 7, 5, 2, 9, 11, 12, 55, 66, 22};
		HashSet<Integer> uniqueValues = new HashSet<Integer>();
		HashSet<Integer> nonRepeatingValues = new HashSet<Integer>();
		
		for(Integer num : nums) {
			if(uniqueValues.contains(num)) {
				nonRepeatingValues.remove(num);
			}
			else {
				uniqueValues.add(num);
				nonRepeatingValues.add(num);
			}
		}
		
		Iterator<Integer> it = nonRepeatingValues.iterator();
		while(it.hasNext()) {
			Integer element = it.next();
			System.out.print(element+", ");
		}
		
		
		
//		for(Integer num : nums) {
//			if(uniqueValues.contains(num)) {
//				uniqueValues.remove(num);
////				nonRepeatingValues.remove(num);
//			}
//			 else {
////				uniqueValues.add(num);
//				nonRepeatingValues.add(num);
//			}
//		}
//		
////		Integer[] nums = {1, 5, 6, 6, 8, 6, 9, 5, 6, 3, 7, 5, 2, 9, 11, 12, 55, 66, 22};
////		HashSet<Integer> uniqueValues = new HashSet<Integer>();
////		HashSet<Integer> nonRepeatingValues = new HashSet<Integer>();
////
////		for (Integer num : nums) {
////		    if (uniqueValues.contains(num)) {
////		        nonRepeatingValues.remove(num);
////		    } else {
////		        uniqueValues.add(num);
////		        nonRepeatingValues.add(num);
////		    }
////		}
//		
//		Iterator<Integer> it = nonRepeatingValues.iterator();
//		while(it.hasNext()) {
//			Integer element = it.next();
//			System.out.print(element+", ");
//		}
//		
//		
////		System.out.println(nonRepeatingValues);
//		
//		
////		Iterator<Integer> it = uniqueValues.iterator();
////		while(it.hasNext()) {
////			Integer element = it.next();
////			System.out.print(element + ", ");
////		}
////		for(Integer num : uniqueValues) {
////			if(Collections.frequency(uniqueValues, num) == 1) {
////				nonRepeatingValues.add(num);
////			}
////		}
////		
////		System.out.println(nonRepeatingValues);
//		
////		Iterator<Integer> values = nonRepeatingValues.iterator();
////		while(values.hasNext()){
////			Integer value = values.next();
////			System.out.print(value+", ");
////		}
		
	}

}
