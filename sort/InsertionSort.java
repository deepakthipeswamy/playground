/**
 * 
 */
package sort;

/**
 * @author Deepak
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 10, 2, 7, 4, 9 };
		int x = 5;
		int output[] = insertionSort(arr);

		for (int k = 0; k < output.length; k++) {
			System.out.println(output[k]);
		}
	}

	private static int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub

		int key = 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		return arr;
	}
}
