package exercise_ex09;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			totalScore += map.get(key);
		}
		int avg = (int) totalScore / map.size();
		System.out.println("평균점수 : " + avg);

		for (String key : keySet) {
			if (maxScore < map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
		}
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수 받은 아이디 : " + name);

	}

}
