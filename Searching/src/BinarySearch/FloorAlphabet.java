package BinarySearch;

public class FloorAlphabet {

	public static void main(String[] args) {
		char [] arr = {'a','b','l','m','n', 'p'};
		char target = 'o';
		int index = floorAlphabet(arr, target);
		System.out.println(index);
	}
	static int floorAlphabet(char[] arr,char target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target > arr.) {
				start = arr[mid]+1;
			}else if(target < arr[mid]) {
				end = arr[mid]-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
