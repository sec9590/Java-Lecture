package practice08_190415.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Exercise02 {

	public static void main(String[] args) throws Exception {
		List<Member> list = new ArrayList<Member>();
		FileReader fr = new FileReader(
				"D:\\workspace\\EGov\\Java\\OpenChallenge\\src\\practice08_190415\\ex02\\addrInput.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;

		while ((data = br.readLine()) != null) {
			// 공백 제거
			String line[] = data.split(",");
			for (int i = 0; i < line.length; i++) {
				line[i] = line[i].trim();
			}
			// 이메일 형식 체크
			String regExp = "\\w+@\\w+(\\.\\w+)?";
			boolean result = Pattern.matches(regExp, line[1]);
			if (!result)
				line[1] = "이메일형식X";

			if (line.length == 2)
				list.add(new Member(line[0], line[line.length - 1], "null"));
			else
				list.add(new Member(line[0], line[1], line[line.length - 1]));
		}

		System.out.println("<Member 명단>");
		for (Member m : list)
			System.out.println(m.toString());

		System.out.println("\n<중복 제거 및 오름차순>");
		
		TreeSet<Member> treeSet = new TreeSet<Member>(list);
		for (Member m : treeSet)
			System.out.println(m.toString());

	}

}
