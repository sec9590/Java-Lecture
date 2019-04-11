package exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "D:/workspace/EGov/Java/Ch18/src/section05/ex04_buffer_reader/BufferedReaderExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int num = 0;
		String data;
		while((data = br.readLine()) != null) {
			System.out.println(++num + " : " + data);
		}
			
	}

}
