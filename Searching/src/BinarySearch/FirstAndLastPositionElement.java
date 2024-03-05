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
		
		int start = numberFrequency(arr, target, true);
		int end = numberFrequency(arr, target, false);
		int[] a = {start,end};
		return a;
	}
	private static int numberFrequency(int[] arr, int target, boolean isFirstElement) {
		int ans = -1;
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			} else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				ans = mid;
				if(isFirstElement) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		return ans;
	}
}
