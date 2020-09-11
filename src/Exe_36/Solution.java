package Exe_36;

public class Solution {

	public static void main(String[] args) {
		int[] Array1 = new int[] { 10, 5, 20, 15, 25, 30 };
		int[] Array2 = new int[] { 50, 12, 5, 30, 15, 70 };
		ArrayList<Integer> array = uniqElements(Array1, Array2);

		for (Integer val : array) {
			System.out.print(val + " ");
		}
	}

	public static ArrayList<Integer> uniqElements(int array1[], int array2[]) {

		Set<Integer> set = new Set<Integer>();
		ArrayList<Integer> resultArray = new ArrayList<Integer>();

		for (Integer val : array1) {
			if (!set.contains(val)) {
			    resultArray.add(val);
				set.add(val);
			}
		}

		for (Integer val : array2) {
			if (!set.contains(val)) {
			    resultArray.add(val);
				set.add(val);
			}
		}

		return resultArray;
	}

}
