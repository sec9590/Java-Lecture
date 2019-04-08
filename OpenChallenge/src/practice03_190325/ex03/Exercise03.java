package practice03_190325.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = new String[10];
		String[] valid = new String[10];
		valid[0] = "true";

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {
			System.out.print("숫자 입력 : ");
			String input = scanner.nextLine();
			number[i] = input;
			for (int j = 0; j < i; j++) {
				if (number[i].equals(number[j])) {
					valid[i] = "false";
					break;
				}				
				else
					valid[i] = "true";
			}			
		}

		
		System.out.println("sample inputs > " + Arrays.toString(number));
		System.out.println("sample inputs > " + Arrays.toString(valid));

	}

}
