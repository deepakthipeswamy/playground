package pattern;

import java.util.HashMap;
import java.util.Map;

public class LongestSequenceBinary {

	public static void main(String[] args) {
		LongestSequenceBinary l = new LongestSequenceBinary();
		int[] nums = { 0, 1, 1, 0, 1, 1 };
		System.out.println(l.findMaxLength(nums));
	}

	public int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxlen = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = count + (nums[i] == 1 ? 1 : -1);
			if (map.containsKey(count)) {
				maxlen = Math.max(maxlen, i - map.get(count));
			} else {
				map.put(count, i);
			}
		}
		System.out.println(map);
		return maxlen;
	}
}
