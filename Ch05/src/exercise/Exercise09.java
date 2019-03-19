package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				grade(scores);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

	public static void grade(int[] scores) {
		int max = 0;
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i])
				max = scores[i];
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double) sum / scores.length;
		System.out.println("최고점수 : " + max);
		System.out.println("평균점수 : " + avg);

	}

}
