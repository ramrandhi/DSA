package com.sorting.cyclicsort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllMissingNumberInArray {
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(findMissingNUmbers(arr)));;
	}
	
	public static int[] findMissingNUmbers(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			int index = arr[i]-1;
			if(arr[index] != arr[i]) {
				swap(arr, index, i);
			} else {
				i++;
			}
		}
				
		return findMissing(arr);
	}
	
	public static void swap(int[] arr, int index, int i) {
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}
	
	public static int[] findMissing(int [] arr) {
		List<Integer> missingNumbers = IntStream.range(0, arr.length)
				.filter(i -> arr[i] != i+1)
				.map(i -> i + 1)
				.boxed()
				.collect(Collectors.toList());
		return missingNumbers.stream().mapToInt(Integer::intValue).toArray();
	}
}
