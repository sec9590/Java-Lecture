package openchallenge.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class MySortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArrayinit = new String[100];
		int count = 0;	
		
		Scanner scanner = new Scanner(System.in);
		String quit = "q";
		
		for (int i = 0; i < strArrayinit.length; i++) {
			System.out.print("문자열 입력[종료는 q] : ");
			String input = scanner.nextLine();
			if (input.equals(quit)) {
				break;
			} else {
				strArrayinit[i] = input;
				count++;
			}
		}
		
		String[] strArray = new String[count];
		System.arraycopy(strArrayinit, 0, strArray, 0, count);

		MySortImpl mysort = new MySortImpl();

		System.out.println("오름차순 정렬 " + Arrays.toString(mysort.sort(strArray)));
		System.out.println("내림차순 정렬 " + Arrays.toString(mysort.sort(strArray, true)));
	}

}
