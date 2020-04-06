package Qs_n_As;

public class FrequencyOfEachCharacter1 {

	public static void main(String[] args) {
		
		String str = "AAABB BCCCD DDEFGHHJ JIIII II";
		
		System.out.println(characterCount(str));
	}
	
	public static String uniqueChars(String str) {
		String newStr = "";
		
		for(int i = 0; i<str.length(); i++) {
			if(!newStr.contains(str.substring(i, i+1))) {
				if(str.substring(i, i+1).equals(" "))
					continue;
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	
	public static String characterCount(String str) {
		
		String newStr = uniqueChars(str);
		String result = "";
		int uniqLength = uniqueChars(str).length();
		
		for(int i=0; i<uniqLength; i++) {
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if(newStr.charAt(i) == (str.charAt(j))) {
					count++;
				}
			}
			result += "" + newStr.charAt(i) + count + " ";
		}
		
		return result;
	}
	
}
