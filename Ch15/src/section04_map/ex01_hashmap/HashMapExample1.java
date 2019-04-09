package section04_map.ex01_hashmap;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //키값이 같기 때문에 제일 마지막에 저장된 것으로 대치
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); //키값으로 value 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //모든 키를 set에 담아서 리턴
		/*
		Iterator<String> keyiterator = keySet.iterator();
		while (keyiterator.hasNext()) {
			String key= keyiterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		*/		
		for(String key : keySet) {			
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //map의 객체 얻기
		/*	
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) { //map.entry의 키와 값 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key= entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		*/
			
		for(Map.Entry<String, Integer> entry : entrySet) {			
			System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();		
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
