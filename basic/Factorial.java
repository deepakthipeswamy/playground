package basic;

import java.util.Random;

public class Factorial {

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		int n = new Random().nextInt(10);
		System.out.println("Input is " + n);

		int[] memArr = new int[n];

		memArr[0] = 1;

		for (int i = 1; i < n; i++) {
			memArr[i] = (i + 1) * memArr[i - 1];
		}
		System.out.println(memArr[n-1]);
	}
}