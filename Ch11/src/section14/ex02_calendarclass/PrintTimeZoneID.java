package section14.ex02_calendarclass;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가능시간대 출력
		String[] availableIDs = TimeZone.getAvailableIDs();
		for (String id : availableIDs) {
			System.out.println(id);
		}

		TimeZone timeZome = TimeZone.getTimeZone("Europe/Paris");
		Calendar now = Calendar.getInstance(timeZome);

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH) + 1;

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else
			strAmPm = "오후";

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.print("[파리시간] : ");
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}

}
