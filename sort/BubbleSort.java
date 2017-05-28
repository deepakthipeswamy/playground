package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 3, 5, 1, 2, 4 };

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				// lowest value bubbles up
				if (input[j] > input[j + 1]) {
					swap(input, j, j + 1);
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}

	private static void swap(int[] input, int i, int j) {
		int temp = 0;
		temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
