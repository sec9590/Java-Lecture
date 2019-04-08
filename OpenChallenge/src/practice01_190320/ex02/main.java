package practice01_190320.ex02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요.");
		System.out.print("a > ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("b > ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.print("연산자 > ");
		String c = scan.nextLine();
		System.out.println();
		System.out.print("결과 > ");

		switch (c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println("a + b = " + add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println("a - b = " + sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println("a * b = " + mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println("a / b = " + div.calculate());
			break;
		}
	}
}
