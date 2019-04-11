package section02.ex04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		// write(char[] c, int off, int len)
		Writer writer = new FileWriter("C:\\Temp\\test.txt");
		char[] data = "홍길동2".toCharArray();
		writer.write(data, 1, 2);

		writer.flush();
		writer.close();

	}

}
