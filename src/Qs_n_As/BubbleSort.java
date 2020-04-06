package Qs_n_As;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 3, 6, 1, 7, 2, 8, 4, 9};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		for(int j=0; j<arr.length; j++) {
			if(isSorted(arr))
				break;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static boolean isSorted(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}

}
