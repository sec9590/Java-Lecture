package section02.ex04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		// write(char[] cbuf)
		Writer writer = new FileWriter("C:\\Temp\\test.txt");
		char[] data = "홍길동2".toCharArray();
		writer.write(data);
		
		writer.flush();
		writer.close();

	}
}
