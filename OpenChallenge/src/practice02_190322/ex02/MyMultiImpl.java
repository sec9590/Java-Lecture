package practice02_190322.ex02;

import java.util.Scanner;

public class MyMultiImpl implements MyMulti {
	int count = 0;	

	public int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

	public int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				if (min > array[i])
					min = array[i];
				count++;
			}
		}
		return min;
	}

	public int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public double avg(int[] array) {
		return (double) sum(array) / count;
	}

}
