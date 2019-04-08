package practice04_190327;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;

		for (num = 10; num < 100; num++) {
			sum += ((num / 10) * (num % 10));
		}

		for (num = 90; num < 1000; num++) {
			sum += ((num / 100) * ((num % 100) / 10) * (num % 10));
		}

		for (num = 1000; num < 1001; num++) {
			sum += ((num / 1000) * ((num % 1000) / 100) * ((num % 100) / 10) * (num % 10));
		}

		System.out.println("10~1000까지 분해하여 곱하기한 값의 전체 합 : " + sum);
	}

}
