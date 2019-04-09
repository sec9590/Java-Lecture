package section02_list.ex01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		//객체 저장
		list.add("java"); 
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		// 저장된 총 객체 수
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		//인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		//저장된 객체수의 출력
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		/*for(String str: list)
			System.out.println(str);*/
		
		//인덱스 또는 객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
