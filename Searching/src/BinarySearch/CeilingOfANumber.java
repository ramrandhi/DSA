package BinarySearch;

public class CeilingOfANumber {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,45,56,69,95,155,255,326,653,2500};
		int target = 180;
		int ceilingOfANumber = ceilingOfANumber(arr, target);
		System.out.println(ceilingOfANumber);
	}
	static int ceilingOfANumber(int[] arr, int target) {
		int  start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target > arr[mid] && target > arr[mid+1]) {
				start = mid+1;
			} else if(target < arr[mid] &&  target < arr[mid-1]) {
				end = mid-1;
			} else {
				return arr[mid];
			}
		};
		
		return Integer.MIN_VALUE;
	}
}
