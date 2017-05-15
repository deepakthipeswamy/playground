/**
 * 
 */
package sort;

/**
 * @author Deepak
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 10, 2, 7, 4, 9 };
		int x = 5;
		int output[] = selectionSort(arr);

		for (int k = 0; k < output.length; k++) {
			System.out.println(output[k]);
		}
	}

	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub

		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					swap(arr, index, j);
				}
			}
		}

		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = 0;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
