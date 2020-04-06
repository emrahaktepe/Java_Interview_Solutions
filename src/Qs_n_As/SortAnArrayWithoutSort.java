package Qs_n_As;

import java.util.Arrays;

//	Write a method where you sort an int[] Array without using the sort method

public class SortAnArrayWithoutSort {

	public static void main(String[] args) {
	
		int[] arr = {5, 1, 4, 2, 3};
		
		System.out.println(Arrays.toString(sortArray(arr)));
	}
	
	public static int[] sortArray(int[] arr) {
		
		for(int j=0; j<arr.length; j++) {
			if(isSorted(arr))
				break;
			
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static boolean isSorted(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
	
	
}
