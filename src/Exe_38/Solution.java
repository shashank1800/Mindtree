package Exe_38;

import java.util.Scanner;

public class Solution {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size N : ");
		int N = sc.nextInt();

		System.out.println("Enter the size M : ");
		int M = sc.nextInt();

		int matA[][] = new int[N][M];
		int matB[][] = new int[N][M];

		System.out.println("Enter matrix A :");
		readMatrix(matA, N, M);

		System.out.println("Enter matrix A :");
		readMatrix(matB, N, M);

		int[][] matC = sumArray(matA, matB, N, M);

		System.out.println("Sum of matrix :");
		printMatrix(matC, N, M);

		sc.close();
	}

	public static void readMatrix(int[][] mat, int N, int M) {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				mat[i][j] = sc.nextInt();
	}

	public static void printMatrix(int[][] mat, int N, int M) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				System.out.print(mat[i][j] + " ");

			System.out.println();
		}

	}

	public static int[][] sumArray(int[][] mat1, int[][] mat2, int N, int M) {
		int[][] matC = new int[N][M];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				matC[i][j] = mat1[i][j] + mat2[i][j];

		return matC;

	}

}
