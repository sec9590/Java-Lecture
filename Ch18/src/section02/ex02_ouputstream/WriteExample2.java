package section02.ex02_ouputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Temp\\test.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
