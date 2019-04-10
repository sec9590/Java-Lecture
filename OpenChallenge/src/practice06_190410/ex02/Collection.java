package practice06_190410.ex02;

import java.util.*;

import practice06_190410.ex03.Company;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		String names[] = text.split(",");
		int kimcount = 0;
		int leecount = 0;

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}

		// 1번
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("김")) {
				kimcount++;
			}
		}
		System.out.println("중복을 포함한 김씨 명수 : " + kimcount + "명");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("이")) {
				leecount++;
			}
		}
		System.out.println("중복을 포함한 이씨 명수 : " + leecount + "명");

		// 2번
		int jaeyoung = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("이재영")) {
				jaeyoung++;
			}
		}
		System.out.println("이재영이라는 이름은 몇 번 중복 : " + jaeyoung + "번");

		// 3번
		Set<String> set = new HashSet<String>(list);
		System.out.print("중복 제거 이름 : ");
		for (String str : set) {
			System.out.print(str + " ");
		}

		// 4번
		TreeSet<String> treeset = new TreeSet<String>(set);
		System.out.print("\n중복 제거 이름(오름차순) : ");
		for (String str : treeset) {
			System.out.print(str + " ");
		}

	}

}
