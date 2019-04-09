package section03_set.ex01_hashset;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30, "010-2456-9590"));
		set.add(new Member("홍길동", 20, "010-2456-9590"));
		
		System.out.println("총 객체수 : " + set.size());
	}

}
