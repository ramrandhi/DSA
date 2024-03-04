package com.problem.solving.sortingtechniques;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {12, 36, 69, 25, 2, 5, 6, 5, 4, 25, 98, 65, 32, 65, 95, 33, 02, 32, 65, 66};
		int larestValuePosition = arr.length;
		boolean swapped = false;
		for(int i = 0; i< larestValuePosition-1;i++) {
			swapped = false;
			for(int j = 0; j< larestValuePosition-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int max = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = max;
					swapped = true;
					
				}
			}
			if(!swapped) {
				break;
			}
		}
		
//		int[] arr = {12, 36, 69, 25, 2, 5, 6, 5, 4, 25, 98, 65, 32, 65, 95, 33, 2, 32, 65, 66};
//        int largestValuePosition = arr.length;
//
//        for (int i = 0; i < largestValuePosition - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < largestValuePosition - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int max = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = max;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//
//         Printing the sorted array
        for (int value : arr) {
            System.out.print(value + ", ");
        }
	}

}
