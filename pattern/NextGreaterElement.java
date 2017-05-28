package pattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] findNums = { 4, 1, 2 };
		int[] nums = { 3, 4, 2, 1, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		for (int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}

		for (int i = 0; i < findNums.length; i++) {
			findNums[i] = map.getOrDefault(findNums[i], -1);
		}

		System.out.println(Arrays.toString(findNums));
	}
}
