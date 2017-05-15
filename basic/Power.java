package basic;

import java.util.Random;

public class Power {

	public static void main(String[] args) {
		int m = new Random().nextInt(10);
		int n = new Random().nextInt(10);

		Power p = new Power();
		System.out.println("Input is " + n + " and " + m);
		System.out.println(p.power(n, m));
		System.out.println(p.powerRecurr(n, m));
	}

	private int power(int a, int b) {
		int total = 1;
		for (int i = 0; i < b; i++) {
			total = total * a;
		}
		return total;
	}

	private int powerRecurr(int a, int b) {
		if (b == 0) {
			return 1;
		} else {
			return a * powerRecurr(a, b - 1);
		}
	}

}
