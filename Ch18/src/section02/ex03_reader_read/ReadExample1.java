package section02.ex03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception{
		//read()
		Reader reader = new FileReader("C:\\Temp\\test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1)
				break;
			System.out.println((char) readData);
		}
		reader.close();

	}

}
