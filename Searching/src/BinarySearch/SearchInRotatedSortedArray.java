package BinarySearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7, 1, 2, 3};
		int target = 1;
		int index = searchInSortedArray(arr, target);
		System.out.println(index);

	}
	// find the target element in the rotated array having duplicate elements
	// find how many rotations an array has taken
	static int  searchInSortedArray(int[] arr, int target){
		int pivot = findPivot(arr);
		int start = 0;
		int end = arr.length-1;
		if(arr[pivot] == target) {
			return pivot;
		}
		if(target >= arr[0]) {
			int indexOfTarget = binarySearch(arr, target, 0, pivot - 1);
			return indexOfTarget;
		} else {
			int indexOfTarget = binarySearch(arr, target, pivot + 1, arr.length-1);
			return indexOfTarget;
		}
	}
	
	static int findPivot(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] <= arr[start]) {
				end = mid-1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target > arr[mid]) {
				start = mid + 1;
			} else if(target < arr[mid]) {
				end = mid -1;
			} else {
				return mid;
			}
		}
		return Integer.MIN_VALUE;
	}

}
