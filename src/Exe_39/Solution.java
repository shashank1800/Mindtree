package Exe_39;

import java.util.Scanner;

public class Solution {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		System.out.println("Enter the size N : ");
		int N = sc.nextInt();

		System.out.println("Enter the size M : ");
		int M = sc.nextInt();

		int mat[][] = new int[N][M];
		readMatrix(mat, N, M);
		
		System.out.println(isRowMagic(mat));
	}
	
	public static void readMatrix(int[][] mat, int N, int M) {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				mat[i][j] = sc.nextInt();
	}

	
	public static boolean isRowMagic(int [][]matrix) {
		int sum = rowSum(matrix[0]);
		
		for(int i=0;i<matrix.length;i++) {
			if(sum!=rowSum(matrix[i]))
				return false;
		}
		return true;
		
	}

	private static int rowSum(int[] row) {
		int sum = 0;
		
		for(Integer val: row)
			sum += val;
		
		return sum;
	}

}
