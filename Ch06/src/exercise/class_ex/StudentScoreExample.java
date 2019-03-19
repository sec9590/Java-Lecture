package exercise.class_ex;

import java.util.Scanner;

public class StudentScoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int math;
		int english;
		int science;

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 > ");
		name = sc.nextLine();
		System.out.print("수학 > ");
		math = Integer.parseInt(sc.nextLine());
		System.out.print("영어 > ");
		english = Integer.parseInt(sc.nextLine());
		System.out.print("과학 > ");
		science = Integer.parseInt(sc.nextLine());

		StudentScore student = new StudentScore(name, math, english, science);

		student.average();
		System.out.println(student.toString());

	}

}
