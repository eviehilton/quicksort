/**
 * 
 */
package quicksort;

import java.util.Random;

/**
 * Evie Hilton 2/12/2020 CSCI 333 Section 2 HW3 Quicksort This class implements
 * several quicksort methods including quicksort with the rightmost element as a
 * pivot and a randomized quicksort with a random element chosen as a pivot.
 *
 */
public class Quicksort {
	public static void main(String[] args) {
		// array 1 quicksort
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		Quicksort newSort = new Quicksort();
		newSort.Quicksort(arr, 0, n - 1);

		System.out.println("sorted array");
		printArray(arr);

		// array 2 quicksort
		int array[] = { 25, 88, 64, 102, 2, 5, 8, -10 };
		int o = array.length;

		Quicksort newSort2 = new Quicksort();
		newSort2.Quicksort(array, 0, o - 1);

		System.out.println("sorted array");
		printArray(array);

		// array 3 quicksort
		int array3[] = { 100, 0, -100 };
		int p = array3.length;

		Quicksort newSort3 = new Quicksort();
		newSort3.Quicksort(array3, 0, p - 1);

		System.out.println("sorted array");
		printArray(array3);

		// array 4 quicksort
		int array4[] = { 1 };
		int q = array4.length;

		Quicksort newSort4 = new Quicksort();
		newSort4.Quicksort(array4, 0, q - 1);

		System.out.println("sorted array");
		printArray(array4);

		// array 5 quicksort
		int array5[] = {};
		int r = array5.length;

		Quicksort newSort5 = new Quicksort();
		newSort5.Quicksort(array4, 0, r - 1);

		System.out.println("sorted array");
		printArray(array5);

		// array 1 randomizedquicksort
		int rarr[] = { 10, 7, 8, 9, 1, 5 };
		int rn = rarr.length;

		Quicksort rnewSort = new Quicksort();
		rnewSort.Quicksort(rarr, 0, rn - 1);

		System.out.println("sorted array");
		printArray(rarr);

		// array 2 randomizedquicksort
		int rarray[] = { 25, 88, 64, 102, 2, 5, 8, -10 };
		int ro = rarray.length;

		Quicksort rnewSort2 = new Quicksort();
		rnewSort2.Quicksort(rarray, 0, ro - 1);

		System.out.println("sorted array");
		printArray(rarray);

		// array 3 randomizedquicksort
		int rarray3[] = { 100, 0, -100 };
		int rp = rarray3.length;

		Quicksort rnewSort3 = new Quicksort();
		rnewSort3.Quicksort(rarray3, 0, rp - 1);

		System.out.println("sorted array");
		printArray(rarray3);

		// array 4 randomizedquicksort
		int rarray4[] = { 1 };
		int rq = rarray4.length;

		Quicksort rnewSort4 = new Quicksort();
		rnewSort4.Quicksort(rarray4, 0, rq - 1);

		System.out.println("sorted array");
		printArray(rarray4);

		// array 5 randomizedquicksort
		int rarray5[] = {};
		int rr = rarray5.length;

		Quicksort rnewSort5 = new Quicksort();
		rnewSort5.Quicksort(rarray4, 0, rr - 1);

		System.out.println("sorted array");
		printArray(rarray5);

	}

	/**
	 * recursive Quicksort method using the rightmost element as the pivot
	 */
	public static void Quicksort(int[] A, int p, int r) {
		if (p < r) {
			int q = Partition(A, p, r); // call partition
			Quicksort(A, p, q - 1);
			Quicksort(A, q + 1, r);

		}
	}

	/**
	 * partition takes a given element as pivot, sorts left and right for greater
	 * and smaller than pivot of current subarray
	 */
	private static int Partition(int[] A, int p, int r) {
		int pivot = A[r]; // r is rightmost value = pivot
		int i = p - 1;
		for (int j = p; j < r; j++) { // iterate through subarray
			if (A[j] <= pivot) { // we find a “small” value less than the pivot x
				i = i + 1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp; // The “small” element goes left
			}
		}
		int temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;

		return i + 1;

	}

	// quicksort with random pivot
	public static void randomizedQuicksort(int[] A, int p, int r) {
		// Random rand = new Random();
		if (p < r) {
			int rnd = new Random().nextInt(A.length); // set random element
			int q = Partition(A, p, rnd); // call partition with random element
			randomizedQuicksort(A, p, q - 1);
			randomizedQuicksort(A, q + 1, r);

		}

	}

	static void printArray(int A[]) {
		int n = A.length;
		for (int i = 0; i < n; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}

}
