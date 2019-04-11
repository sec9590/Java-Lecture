package section02.ex03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// read(char[] cbuf)
		Reader reader = new FileReader("C:\\Temp\\test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		while(true) {
			readCharNo = reader.read();
			if(readCharNo == -1)
				break;
			System.out.println(readCharNo);
		}
		reader.close();

	}

}
