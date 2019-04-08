package practice02_190322.ex01;

import java.util.Scanner;

public class MyCalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc cal = new MyCalc();

		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		System.out.print("a > ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("b > ");
		int b = Integer.parseInt(scan.nextLine());

		System.out.println(a + " + " + b + " = " + cal.add(a, b));
		System.out.println(a + " - " + b + " = " + cal.sub(a, b));
		System.out.println(a + " * " + b + " = " + cal.mul(a, b));
	}

}
