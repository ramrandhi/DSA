package BinarySearch;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 26, 89, 569, 2658, 5688, 9522, 12555, 6056656, 656456656, 656456657};
        int target = 15;
        int indexOfTarget = findElementInInfiniteArray(arr, target);
        System.out.println(indexOfTarget);
    }

    static int findElementInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
