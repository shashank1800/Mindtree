package Exe_40;

import java.util.Scanner;

public class Solution {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size N : ");
		int N = sc.nextInt();

		int mat[][] = new int[N][N];
		readMatrix(mat, N);

		System.out.println(isMagic(mat));
	}

	public static void readMatrix(int[][] mat, int N) {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				mat[i][j] = sc.nextInt();
	}

	public static boolean isMagic(int[][] matrix) {

		int N = matrix.length;
		int sum = arraySum(matrix[0]);

		// Check row wise
		for (int i = 0; i < N; i++) {
			if (sum != arraySum(matrix[i]))
				return false;
		}

		// Check column wise
		for (int i = 0; i < N; i++) {
			int[] column = new int[N];

			for (int j = 0; j < N; j++)
				column[j] = matrix[j][i];

			if (arraySum(column) != sum)
				return false;
		}

		// Check diagonally
		int dg1 = 0;
		for (int i = 0; i < N; i++) {
			dg1 += matrix[i][i];
		}
		if (dg1 != sum)
			return false;

		int dg2 = 0;
		for (int i = N - 1; i >= 0; i--) {
			dg2 += matrix[i][i];
		}
		if (dg2 != sum)
			return false;

		return true;

	}

	private static int arraySum(int[] array) {
		int sum = 0;

		for (Integer val : array)
			sum += val;

		return sum;
	}

}
