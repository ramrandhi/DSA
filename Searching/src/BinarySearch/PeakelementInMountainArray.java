package BinarySearch;

public class PeakelementInMountainArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,7,6,5,2,1};
		int indexOfPeak = findPeakOfMountain(arr);
		System.out.println(indexOfPeak);
	}

	static int findPeakOfMountain(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {                    // it is not start <= end condition because it will return start or end
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;                   // because we cannot have greater after end with this condition
			} else {
				start = mid+1;
			}
		}
		return start;    // as the start and becomes same it can return either start or end
	}
}
