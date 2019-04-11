package section02.ex01_inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:\\Temp\\test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1)
				break;
			System.out.print((char)readByte);
		}
		is.close();

	}

}
