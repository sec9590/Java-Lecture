package practice04_190327;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 > ");

		int num = Integer.parseInt(scan.nextLine());
		int sum1 = 0; // 제곱의 합
		int sum2 = 0; // 합의 제곱

		for (int i = 1; i <= num; i++) {
			sum1 += Math.pow(i, 2);
		}

		for (int i = 1; i <= num; i++) {
			sum2 += i;
		}

		int result = (int) (Math.pow(sum2, 2) - sum1);
		System.out.println("합의 제곱 - 제곱의 합 = " + result);
	}

}
