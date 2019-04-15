package practice08_190415.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.Map.Entry;

public class WordCount {

	public static void main(String[] args) throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		FileReader fr = new FileReader(
				"D:\\workspace\\EGov\\Java\\OpenChallenge\\src\\practice08_190415\\ex03\\word.txt");
		BufferedReader br = new BufferedReader(fr);

		String data = "";

		while ((data = br.readLine()) != null) {
			String wordarray[] = data.split(",| |\\.");
			for (String str : wordarray) {
				if (map.containsKey(str)) {
					int count = map.get(str) + 1;
					map.put(str, count);
				} else
					map.put(str, 1);
			}
		}

		System.out.println("총 단어 수 : " + map.size());
		
		TreeSet<Word> word = new TreeSet<Word>();
		Set<Map.Entry<String, Integer>> mapset = map.entrySet();
		for(Map.Entry<String, Integer> entry : mapset) {
			word.add(new Word(entry.getKey(), entry.getValue()));
		}
	
		
		System.out.println("\n[가장 많이 나온 단어의 수]");
		int max = 0;
		for (Word w : word) {			
			max++;
			System.out.println(w.toString());
			if(max == 10)
				break;
		}

	}

}
