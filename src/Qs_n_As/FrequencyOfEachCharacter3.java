package Qs_n_As;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacter3 {

	public static void main(String[] args) {

		String str = "aaabbccdeeeeeeeeffffzzz";
		charWithCounts(str);
	}

	public static void charWithCounts(String str) {

		Map<Character, Integer> freqs = new HashMap<>();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!freqs.containsKey(ch)) {
				freqs.put(ch, 1);
			} else {
				freqs.put(ch, (freqs.get(ch)) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
			result += "" + entry.getKey() + entry.getValue() + " ";
		}
		System.out.println(result);
	}

}
