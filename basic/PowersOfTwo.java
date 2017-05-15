package basic;

import java.util.Random;

public class PowersOfTwo {

	public static void main(String[] args) {

		int n = new Random().nextInt(50);

		PowersOfTwo p = new PowersOfTwo();
		System.out.println("Input is " + n);
		p.powerOfTwo1(n);
	}

	private int powerOfTwo(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			int curr = 2 * powerOfTwo(n / 2);
			System.out.println(curr);
			return curr;
		}
	}

	private void powerOfTwo1(int n) {
		int total = 2;
		while (total < n) {
			total = 2 * total;
			System.out.println(total);
		}
	}
}
