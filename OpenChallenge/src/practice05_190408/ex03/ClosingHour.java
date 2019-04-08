package practice05_190408.ex03;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClosingHour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("[현재시간] ");
		String strDate = scan.nextLine();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse(strDate, dateTimeFormatter);
		
		LocalTime closinghour = LocalTime.of(18, 30, 00);
		Duration duration = Duration.between(localTime, closinghour);
		
		int hours = (int) (duration.getSeconds() / 3600);
		int minute = (int) (duration.getSeconds() - hours * 3600) / 60;
		int seconds = (int) duration.getSeconds() - hours * 3600 - minute * 60;
		
		System.out.println("[18:30까지 남은시간] " + hours + "시간 " + minute + "분 " + seconds + "초 ");

	}

}
