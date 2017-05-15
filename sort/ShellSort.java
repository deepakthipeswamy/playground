package sort;

public class ShellSort {

	public static void main(String[] args) {
		ShellSort s = new ShellSort();
		int[] arr = s.shellsort();

		for (int a : arr) {
			System.out.println(a);
		}
	}

	private static int[] shellsort() {
		int[] a = { 44, 5, 33, 22, 765, 43, 53, 12, 57, 97 };

		// first section gets the Knuth's interval sequence (very efficient)
		int h = 1;
		while (h <= a.length / 3) {
			h = 3 * h + 1; // h is equal to highest sequence of h<=length/3
							// (1,4,13,40...)
		}

		// next section
		while (h > 0) { // for array of length 10, h=4

			// similar to insertion sort below
			for (int i = 0; i < a.length; i++) {

				int temp = a[i];
				int j;

				for (j = i; j > h - 1 && a[j - h] >= temp; j = j - h) {
					a[j] = a[j - h];
				}
				a[j] = temp;
			}
			h = (h - 1) / 3;
		}

		return a;
	}
}
