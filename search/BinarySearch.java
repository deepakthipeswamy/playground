/**
 * 
 */
package search;

/**
 * @author Deepak
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 5, 7, 8, 10 };
		int x = 5;
		int index = binary(a, 0, a.length, x);

		System.out.println("Found at " + index);

	}

	private static int binary(int[] a, int low, int high, int x) {

		while (a.length > 1) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				return binary(a, mid + 1, high, x);
			} else {
				return binary(a, low, mid - 1, x);
			}
		}

		return -1;
	}

}
