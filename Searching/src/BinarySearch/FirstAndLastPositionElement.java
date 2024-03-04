package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionElement {

	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		int[] indexes = firstAndLastPositionElement(arr, target);
		System.out.println(Arrays.toString(indexes));
	}
	static int[] firstAndLastPositionElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
		}
		return new int[] {-1,-1};
	}
}
