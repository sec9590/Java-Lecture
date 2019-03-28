package openchallenge;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 > ");
		String str = scan.nextLine();
		System.out.print("숫자 입력 > ");
		int n = scan.nextInt();
		String change = "";

		for (int i = 0; i < str.length(); i++) {
			char c = (char) ((str.charAt(i)) + n);
			change += String.valueOf(c);
		}

		System.out.println("암호 생성 > " + change);

	}

}
