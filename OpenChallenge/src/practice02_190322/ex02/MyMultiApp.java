package practice02_190322.ex02;

import java.util.Scanner;

public class MyMultiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("정수 입력[종료는 q] : ");
			String input = scanner.nextLine();
			if (input.equals("q"))
				break;
			else {
				int n = Integer.parseInt(input);
				array[i] = n;
			}
		}
		
		MyMultiImpl myMulti = new MyMultiImpl();
	
		System.out.println("입력한 정수의 최대값 : " + myMulti.max(array));
		System.out.println("입력한 정수의 최소값 : " + myMulti.min(array));
		System.out.println("입력한 정수의 합 : " + myMulti.sum(array));
		System.out.println("입력한 정수의 평균 : " + myMulti.avg(array));
	}

}
