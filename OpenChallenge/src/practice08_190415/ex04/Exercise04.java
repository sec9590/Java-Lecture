package practice08_190415.ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise04 {

	public static void main(String[] args) throws Exception {
		
		/* for(int i=1; i<=3; i++) { 
		 	File Folder = new File( "D:\\workspace\\EGov\\Java\\OpenChallenge\\src\\practice08_190415\\ex04\\low\\"+i);
		    Folder.mkdir(); 
		   } */

		for (int i = 0; i < 100; i++) {
			int filename = (int) (Math.random() * 9000) + 1000;
			System.out.println("파일 이름 : " + filename);
			File file = new File(
					"D:\\workspace\\EGov\\Java\\OpenChallenge\\src\\practice08_190415\\ex04\\" + filename + ".txt");

			FileWriter fw = new FileWriter(file, true);
			int num = (int) (Math.random() * 3) + 1;
			String text = String.valueOf(num);
			fw.write(text);
			fw.flush();
			fw.close();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String data;

			while ((data = br.readLine()) != null) {
				if (filename <= 3333) {
					filemove(file, filename, data, "low");
				} else if (filename <= 6666 && filename > 3333) {
					filemove(file, filename, data, "mid");
				} else {
					filemove(file, filename, data, "high");
				}
			}
			fr.close();
			br.close();

			if (file.delete())
				System.out.println("파일 이동완료");
			else
				System.out.println("파일 이동실패");

		}

	}

	public static void filemove(File file, int filename, String data, String move) throws Exception {
		String str = "D:\\workspace\\EGov\\Java\\OpenChallenge\\src\\practice08_190415\\ex04";
		String after = "";
		System.out.println("파일 내용 : " + data);
		switch (data) {
		case "1":
			after = str + "\\" + move + "\\1\\" + filename + ".txt";
			break;
		case "2":
			after = str + "\\" + move + "\\2\\" + filename + ".txt";
			break;
		case "3":
			after = str + "\\" + move + "\\3\\" + filename + ".txt";
			break;
		}
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(after);

		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}

		fos.flush();
		fos.close();
		fis.close();

	}

}
