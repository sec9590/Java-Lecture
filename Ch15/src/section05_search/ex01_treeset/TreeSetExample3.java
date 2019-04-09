package section05_search.ex01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("apple");
		treeset.add("forever");
		treeset.add("description");
		treeset.add("ever");
		treeset.add("zoo");
		treeset.add("base");
		treeset.add("guess");
		treeset.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeset.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
				
	}

}
