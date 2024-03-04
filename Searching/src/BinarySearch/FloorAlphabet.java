package BinarySearch;

public class FloorAlphabet {

	public static void main(String[] args) {
		char [] arr = {'a','b','l','m','n', 'p'};
		char target = 'o';
		char index = floorAlphabet(arr, target);
		System.out.println(index);
	}
	static char floorAlphabet(char[] arr,char target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target > arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return arr[start%arr.length];
	}
}
