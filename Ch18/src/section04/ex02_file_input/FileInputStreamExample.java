package section04.ex02_file_input;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\workspace\\EGov\\Java\\Ch18\\src\\section04\\ex02_file_input\\FileInputStreamExample.java");
			
			int data;
			while((data=fis.read()) != -1) {
				System.out.println(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
