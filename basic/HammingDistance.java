package basic;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistance(5,3));
	}

	public static int hammingDistance(int x, int y) {
		int number = x > y ? x : y;
		int count = 0;
		while (number > 0) {
			int bin = x % 2;
			x /= 2;
			int bin2 = y % 2;
			y /= 2;
			if (bin != bin2)
				count++;
			number /= 2;
		}
		return count;
	}
}