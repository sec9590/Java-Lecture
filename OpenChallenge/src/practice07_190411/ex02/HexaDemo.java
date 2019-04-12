package practice07_190411.ex02;

import java.io.FileInputStream;
import java.util.Scanner;

public class HexaDemo {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.printf("찾을 파일명 > ");
			String filePath = scan.nextLine();

			FileInputStream fis = new FileInputStream(filePath);
			byte[] buf = new byte[16];
			int data;

			int count = 0;

			while ((data = fis.read(buf)) != -1) {
				System.out.printf("%08X:  ", count);

				for (int i = 0; i < data; i++) {
					if (i == 8)
						System.out.printf(" ");
					System.out.printf("%02X ", buf[i]);
				}

				for (int i = 0; i <= (16 - data); i++)
					System.out.printf("   ");

				for (int i = 0; i < data; i++) {
					if (buf[i] >= 32 && buf[i] <= 126)
						System.out.printf("%c", buf[i]);
					else
						System.out.printf(".");
				}

				count += 16;
				System.out.println();
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
