package practice06_190410.ex01;

import java.util.Arrays;

public class NoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		String names[] = text.split(",");
		String kim[] = new String[100];
		String Lee[] = new String[100];
		int kimcount = 0;
		int leecount = 0;

		// 1번
		for (int i = 0; i < names.length; i++) {
			if (String.valueOf(names[i].charAt(0)).equals("김")) {
				kim[i] = names[i];
				kimcount++;
			}
		}
		System.out.println("중복을 포함한 김씨 명수 : " + kimcount + "명");

		for (int i = 0; i < names.length; i++) {
			if (String.valueOf(names[i].charAt(0)).equals("이")) {
				Lee[i] = names[i];
				leecount++;
			}
		}
		System.out.println("중복을 포함한 이씨 명수 : " + leecount + "명");

		// 2번
		int jaeyoung = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].indexOf("이재영") >= 0) {
				jaeyoung++;
			}
		}
		System.out.println("이재영이라는 이름은 몇 번 중복 : " + jaeyoung + "번");

		// 3번
		String noOverlap = "";
		for (int i = 0; i < names.length; i++) {
			if (noOverlap.indexOf(names[i]) == -1) {
				noOverlap += (names[i] + " ");
			}
		}
		System.out.print("중복 제거 이름 : ");
		System.out.println(noOverlap);

		// 4번
		String noOverlapnames[] = noOverlap.split(" ");
		Arrays.sort(noOverlapnames);
		System.out.print("중복 제거 이름(오름차순) : ");
		for (int i = 0; i < noOverlapnames.length; i++) {
			System.out.print(noOverlapnames[i] + " ");
		}

	}

}
