package Exe_36;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] Array1 = new int[] { 10, 5, 20, 15, 25, 30 };
		int[] Array2 = new int[] { 50, 12, 5, 30, 15, 70 };
		Integer[] array = uniqElements(Array1, Array2);

		for (Integer val : array) {
			System.out.print(val + " ");
		}
	}

	public static Integer[] uniqElements(int array1[], int array2[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> Result_Array = new ArrayList<Integer>();

		for (Integer val : array1) {
			if (!set.contains(val)) {
				Result_Array.add(val);
				set.add(val);
			}
		}

		for (Integer val : array2) {
			if (!set.contains(val)) {
				Result_Array.add(val);
				set.add(val);
			}
		}

		return Result_Array.toArray(new Integer[Result_Array.size()]);
	}

}
