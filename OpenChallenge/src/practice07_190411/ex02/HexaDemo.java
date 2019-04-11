package practice07_190411.ex02;

import java.io.FileInputStream;

public class HexaDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\workspace\\EGov\\Java\\Ch18\\bin\\section04\\ex02_file_input\\FileInputStreamExample.class");
	
			int data;
			int count = 0;
			
			while ((data = fis.read()) != -1) {
				count++;
				String hexa = Integer.toHexString(data);
				StringBuffer hexa_ = new StringBuffer(hexa);
				if (hexa.length() == 1)
					hexa_.insert(0, "0");
				System.out.print(hexa_ + " ");

				if (count == 16) {
					System.out.println();
					count = 0;
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
