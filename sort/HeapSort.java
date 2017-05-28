package sort;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = { 3, 5, 1, 2, 4 };
		heapSort(a);
	}

	public static void heapSort(int[] a) {
		buildHeap(a);
		int heapsize = a.length;
		for (int i = heapsize; i >= 1; i--) {
			System.out.println(a[0]);
			swap(1, i, a);
			heapsize--;
			maxHeapify(a, 1, heapsize);
		}
	}

	private static void buildHeap(int[] a) {
		for (int i = a.length / 2; i >= 1; i--) {
			maxHeapify(a, i, a.length);
		}
	}

	private static void maxHeapify(int[] a, int i, int heapSize) {
		int l = left(i);
		int r = right(i);
		int largest;

		if (l <= heapSize && a[l - 1] > a[i - 1]) {
			largest = l;
		} else {
			largest = i;
		}

		if (r <= heapSize && a[r - 1] > a[i - 1]) {
			largest = r;
		}

		if (largest != i) {
			swap(i, largest, a);
			maxHeapify(a, largest, heapSize);
		}
	}

	public static int left(int num) {
		return 2 * num;
	}

	public static int right(int num) {
		return (2 * num) + 1;
	}

	public static void swap(int num1, int num2, int[] a) {
		int temp;
		temp = a[num1 - 1];
		a[num1 - 1] = a[num2 - 1];
		a[num2 - 1] = temp;
	}
}
