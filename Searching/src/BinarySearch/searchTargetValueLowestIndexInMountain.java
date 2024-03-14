package BinarySearch;

public class searchTargetValueLowestIndexInMountain {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1};
		int target = 3;
		int lowestIndexOfTarget = searchTargetValueLowestIndex(arr, target);
		System.out.println(lowestIndexOfTarget);
	}

	static int searchTargetValueLowestIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid+1;
			}
		}
		int first = bsForIncliningHill(arr, start, target, true);
		int second = bsForDecliningHill(arr, start, target, false);
		int fromEnd = arr.length-second-1;
		int index = (first > fromEnd) ? first : fromEnd;
		return index;
	}

	static int bsForIncliningHill(int[] arr, int start, int target, boolean isStarting) {
		if (isStarting) {
			int firstIndex = 0;
			int lastIndex = start;
			while (firstIndex <= lastIndex) {
				int mid = firstIndex + (lastIndex - firstIndex) / 2;
				if (target > arr[mid]) {
					firstIndex = mid + 1;
				} else if (target < arr[mid]) {
					lastIndex = mid - 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}

	static int bsForDecliningHill(int[] arr, int start, int target, boolean isStarting) {
		if (!isStarting) {
			int firstIndex = start;
			int lastIndex = arr.length - 1;
			while (firstIndex <= lastIndex) {
				int mid = firstIndex + (lastIndex - firstIndex) / 2;
				if (target > arr[mid]) {
					lastIndex = mid - 1;
				} else if (target < arr[mid]) {
					firstIndex = mid + 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}

}
