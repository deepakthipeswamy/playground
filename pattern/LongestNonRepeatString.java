package pattern;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatString {
	public static void main(String[] args) {
		String s = "pwwkew";
		Map<Character, Integer> map = new HashMap<>();
		int n = s.length();
		int i = 0, max = 0;

		for (int j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				// latest i
				i = Math.max(map.get(s.charAt(j)), i);
			}
			// how far is j from i  
			max = Math.max(max, j + 1 - i);
			map.put(s.charAt(j), j + 1);
		}

		System.out.println(max);
	}
}
