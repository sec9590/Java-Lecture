package practice04_190327;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열(숫자로만) 입력하세요 > ");
		String str = scan.nextLine();

		dashInsert(str);

	}

	public static void dashInsert(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		for (int i = 0; i < sb.length() - 1; i++) {
			if ((int) sb.charAt(i) < 48 || (int) sb.charAt(i) > 58) // 문자일경우 continue
				continue;

			int num1 = Integer.parseInt(sb.charAt(i) + "");
			int num2 = Integer.parseInt(sb.charAt(i + 1) + "");

			if (num1 % 2 == 0) {
				if (num2 % 2 == 0) {
					sb.insert(i + 1, "*");
				}
			} else {
				if (num2 % 2 != 0) {
					sb.insert(i + 1, "-");
				}
			}

		}

		System.out.println(sb.toString());

	}
}
