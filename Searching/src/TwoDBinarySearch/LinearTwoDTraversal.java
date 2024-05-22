package TwoDBinarySearch;

public class LinearTwoDTraversal {

	public static void main(String[] args) {
		int[][] arr = {
				{4,5,6,7},
				{2,5},
				{6,5,8,4,5,5,4,7}
		};
		int target = 7;
		boolean found = false;
		for(int i = 0;i< arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j] == target) {
					System.out.println("Target found at index: [" + i + "][" + j + "]");
					found = true;
					break;
				}
			}
			if(found == true) {
				break;
			}
		}

	}

}
