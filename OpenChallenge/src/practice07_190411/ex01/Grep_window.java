package practice07_190411.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Grep_window {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 문자열 > ");
		String str = scan.nextLine();
		System.out.print("찾을 파일명 > ");
		String filePath = scan.nextLine();
		System.out.println();
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int num = 0;
		String data;
		while((data = br.readLine()) != null) {
			++num;
			if(data.indexOf(str) > -1)
				System.out.println(num + " : " + data);
		}
	}

}
