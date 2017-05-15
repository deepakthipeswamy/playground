package basic;

public class BinaryCompliment {

	public static void main(String[] args) {

		int num = 5;
		int total = 0;
		int count = 1;

		while (num > 0) {
			int bin = num % 2;
			if (bin == 0) {
				total = total + count;
			}
			count *= 2;
			num = num / 2;
		}
		System.out.println(total);

		findComplement(5);
	}

	public static void findComplement(int num) {
		if (num == Integer.MAX_VALUE) {
			System.out.println(0);
		}
		int mask = 1;
		while (mask < num) {
			mask = (mask << 1) + 1;
		}
		System.out.println(mask ^ num);
	}
}
