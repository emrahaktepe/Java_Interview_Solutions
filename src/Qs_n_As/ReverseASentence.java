package Qs_n_As;

//	Write a method where you reverse a sentence word by word

public class ReverseASentence {

	public static void main(String[] args) {

		String str = "ey edip adanada pide ye";
		System.out.println(reverseSentence(str));
		
	}

	public static String reverseSentence(String str) {
		String newStr = "";
		String[] words = str.split(" ");
		for(int i = words.length-1; i>=0; i--) {
			newStr += words[i]+" ";
		}
				return newStr;
	}

}
