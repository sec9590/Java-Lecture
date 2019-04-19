package test_190328.exam16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

	}

	public static void input() {
		String regExp = "\\d{6}-\\d{1}";
		Scanner scan = new Scanner(System.in);
		System.out.print("\n입력(예시: 180917-4) > ");
		String str = scan.nextLine();
		boolean result = Pattern.matches(regExp, str);
		if (result) {
			dateformat(str);
		} else {
			System.out.println("형식에 맞춰 입력해주세요");
			input();
		}
	}

	public static void dateformat(String str) {
		Scanner scan = new Scanner(System.in);
		String strDate = "";
		String strWeek = "";

		String ssn = str.substring(0, 6);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
		LocalDate date = LocalDate.parse(ssn, formatter);		
		
		switch (date.getDayOfWeek()) {
		case MONDAY:
			strWeek = "월";
			break;
		case TUESDAY:
			strWeek = "화";
			break;
		case WEDNESDAY:
			strWeek = "수";
			break;
		case THURSDAY:
			strWeek = "목";
			break;
		case FRIDAY:
			strWeek = "금";
			break;
		case SATURDAY:
			strWeek = "토";
			break;
		case SUNDAY:
			strWeek = "일";
			break;
		}		
				
		if (date.isLeapYear()) {
			System.out.println("\n올해 2월은 29일까지 있습니다.");
			System.out.print("잘못 입력하셨으면 다시 입력해주세요. (1 : 다시입력 / 2 : 진행) > ");
			int num = Integer.parseInt(scan.nextLine());
			if(num == 1) {
				input();					
			} else {
				strDate = "\n" + date.getYear() + "년 ";
				strDate += date.getMonthValue() + "월 ";
				strDate += date.getDayOfMonth() + "일 ";
				System.out.print(strDate);
				System.out.print("(" + strWeek + "), ");
				gender(str);
			}
		} else {
			System.out.println("\n올해 2월은 28일까지 있습니다.");
			System.out.print("잘못 입력하셨으면 다시 입력해주세요. (1 : 다시입력 / 2 : 진행) > ");
			int num = Integer.parseInt(scan.nextLine());
			if(num == 1) {
				input();	
				strDate = "";
			} else {
				strDate = "\n" + date.getYear() + "년 ";
				strDate += date.getMonthValue() + "월 ";
				strDate += date.getDayOfMonth() + "일 ";	
				System.out.print(strDate);
				System.out.print("(" + strWeek + "), ");				
				gender(str);
			}			
		}						

	}

	public static void gender(String str) {
		int gender = (int) str.charAt(7);

		if (gender % 2 == 0) {
			System.out.print("여자");
		} else
			System.out.println("남자");
	}

}
