package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 2, 3, 4, 5, 6 };
		int target = 11;

		TwoSum t = new TwoSum();
		int[] result = t.twoSum(intArr, target);

		System.out.println(Arrays.toString(result));
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (myMap.containsKey(diff)) {
				return new int[] { myMap.get(diff), i };
			} else {
				myMap.put(nums[i], i);
			}
		}
		return null;
	}
}
