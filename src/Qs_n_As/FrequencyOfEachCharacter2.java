package Qs_n_As;

public class FrequencyOfEachCharacter2 {

	public static void main(String[] args) {
		String str = "AABBCCDDEEEEEE";
		charWithCount(str);
		
	}
	
	public static void charWithCount(String str) {
		
		String newStr = "";
		
		for(int i=0; i<str.length(); i++) {
			if(newStr.contains(str.substring(i, i+1)))
				continue;
			String check = str.replaceAll(str.substring(i, i+1),  "");
			newStr += str.substring(i, i+1) + (str.length()-check.length()) + " ";
		}
		
		System.out.println(newStr);
	}
	
}
