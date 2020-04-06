package Qs_n_As;

import java.util.Arrays;

//	Write a method to check if the two given Strings are Anagram

public class IsAnagram {

	public static void main(String[] args) {
		
		String one = "racecar";
		String two = "car race";
		
		System.out.println(isAnagram(one, two));
		
	}
	
	public static boolean isAnagram(String one, String two) {
		one = one.toLowerCase().replace(" ", "");
		two = two.toLowerCase().replace(" ", "");
		
		char[] oneArr = one.toCharArray();
		Arrays.sort(oneArr);
		
		char[] twoArr = two.toCharArray();
		Arrays.sort(twoArr);
		
		if(Arrays.equals(oneArr, twoArr))
			return true;

		return false;
		
	}

	
	public static boolean isAnagramLong(String one, String two) {
		
		one = one.toLowerCase().replace(" ", "");
		two = two.toLowerCase().replace(" ", "");
		
		char[] oneArr = one.toCharArray();
		Arrays.sort(oneArr);
		one = String.valueOf(oneArr);
		
		char[] twoArr = two.toCharArray();
		Arrays.sort(twoArr);
		two = String.valueOf(twoArr);

		
		if(one.equals(two))
			return true;

		return false;
	}
	
}
