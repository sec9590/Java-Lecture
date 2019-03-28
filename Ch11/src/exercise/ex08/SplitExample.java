package exercise.ex08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";

		// 방법 1
		String tests[] = str.split(",");
		for (String test : tests)
			System.out.println(test);

		System.out.println();

		// 방법 2
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
