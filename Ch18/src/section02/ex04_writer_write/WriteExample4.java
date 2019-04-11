package section02.ex04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		//write(String str), write(String str, int off, int len)
		Writer writer = new FileWriter("C:\\Temp\\test.txt");
		
		String data = "안녕 자바 프로그램";
		writer.write(data);
		// wirter.write(data, 2, 3)
		writer.flush();
		writer.close();

	}

}
