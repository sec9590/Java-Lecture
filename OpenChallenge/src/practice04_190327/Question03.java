package practice04_190327;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 > ");

		int num = Integer.parseInt(scan.nextLine());

		for (int n = 1; n <= num; n++) {
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if ((n % i) == 0) {
					sum += i;
				}
			}
			if (sum == n) {
				System.out.println("완전수 : " + n);
				continue;
			}
		}

	}
}
