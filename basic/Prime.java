package basic;

import java.util.Random;

public class Prime {

	public static void main(String[] args) {

		Random rand = new Random();
		int n = rand.nextInt(5);
		System.out.println("Input is " + n);

		boolean isPrime = true;
		if (n == 0 || n == 1) {
			isPrime = false;
		} else {
			for (int x = 2; x * x <= n; x++) {
				if (n % x == 0) {
					isPrime = false;
				}
			}
		}
		System.out.println("Is a prime? " + isPrime);
	}
}
