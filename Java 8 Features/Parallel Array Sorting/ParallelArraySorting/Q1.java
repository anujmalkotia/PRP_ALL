package ParallelArraySorting;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 10, 2, 8, 6, 23, 15, 9, 18, 7};
		System.out.print("Array: " + Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println("\nSum of max and min element: " + (array[0]+array[9]));
	}

}
