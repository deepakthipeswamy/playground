package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries fib = new FibonacciSeries();

		int n = new Random().nextInt(10);
		System.out.println("Input is " + n);
		
		int[] memArr = new int[n];
		
		memArr[0] = 0;
		memArr[1] = 1;
		
		for(int i=2; i<n; i++){
			memArr[i] = memArr[i-1] + memArr[i-2];
		}
		
		System.out.println(Arrays.toString(memArr));

		Map<Integer, Integer> memoryMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			// System.out.println(fib.fibo(i) + " ");
			System.out.println(fib.fibo(i, new int[n + 1]) + " ");
		}
	}

	// O(n)
	private int fibo(int n, int[] memArr) {
		// HashMaps use arrays underneath .. Arrays are always faster
		if (n == 0 || n == 1) {
			return n;
		} else if (memArr[n] > 0) {
			return memArr[n];
		}
		// save computed value in array, use when its needed again
		memArr[n] = (fibo(n - 1, memArr) + fibo(n - 2, memArr));
		return memArr[n];

	}
	
	// classic implementation O(n*n)
	private int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return (fibo(n - 1) + fibo(n - 2));
	}
}
