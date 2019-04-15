package practice08_190415.ex01;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
	public static void main(String[] args) {
		List<String> participants = new ArrayList<String>();
		List<String> completioners = new ArrayList<String>();
		
		participants.add("홍길동");
		participants.add("홍길동");
		participants.add("홍길동");
		participants.add("김자바");
		participants.add("김철수");
		participants.add("신짱구");
		participants.add("이훈이");
		participants.add("김철수");
		
		int num = (int) Math.floor(Math.random() * participants.size());
		String str = participants.get(num);
		participants.remove(str);
		System.out.println("완주하지 못한 사람 : " + str);
		
		while(participants.contains(str)) {
			participants.remove(str);
		}
		
		completioners.addAll(participants);
			
		System.out.print("완주 한 사람 : " );
		for(String s : completioners)
			System.out.print(s + " ");
	}
}
