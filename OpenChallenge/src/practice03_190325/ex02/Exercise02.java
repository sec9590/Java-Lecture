package practice03_190325.ex02;

import java.util.Arrays;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds = 0;

		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				if (hour % 10 == 3 || minute / 10 == 3 || minute % 10 == 3)
					seconds += 60;				
			}
		}
		System.out.println("디지털 시계에 3이 표시되는 시간 = " + seconds + "초");

	}
}
