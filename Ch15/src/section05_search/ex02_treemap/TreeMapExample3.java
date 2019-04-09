package section05_search.ex02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


public class TreeMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("apple", new Integer(10));
		treemap.put("forever", new Integer(60));
		treemap.put("description", new Integer(40));
		treemap.put("ever", new Integer(50));
		treemap.put("zoo", new Integer(10));
		treemap.put("base", new Integer(20));
		treemap.put("guess", new Integer(70));
		treemap.put("cherry", new Integer(30));
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treemap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + "페이지");
		}
	}

}
