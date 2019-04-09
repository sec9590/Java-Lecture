package section03_set.ex01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();

		// 객체 저장
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java"); // 동일한 객체는 저장안됨.
		set.add("iBATIS");

		// 저장된 총 객체 수
		int size = set.size();
		System.out.println("총 객체수 : " + size);

		// 저장된 객체를 한번씩 가져오는 반복자 리턴
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수 : " + set.size());

		iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear(); // 모든객체 제거 후 비움
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
