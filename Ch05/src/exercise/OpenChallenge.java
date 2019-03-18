package exercise;

import java.util.Arrays;

public class OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println("array1 > ");
		print(array1);

		System.out.println("array2 > ");
		print(array2);

		System.out.println("Matrix Multiplication > ");
		int[][] result = matMul(array1, array2);
		print(result);

	}

	public static int[][] matMul(int[][] x, int[][] y) {
		if (x[0].length != y.length)
			return null;
		int row = x.length;
		int col = y[0].length;
		int size = y.length;
		int[][] result = new int[row][col];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				int sum = 0;
				for (int i = 0; i < size; i++) {
					sum += x[r][i] * y[i][c];
				}
				result[r][c] = sum;
			}
		}
		return result;
	}

	public static void print(int[][] arrays) {
		for (int[] array : arrays)
			System.out.println(Arrays.toString(array));
	}

}
