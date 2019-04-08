package practice05_190408.ex01;

import java.util.Scanner;

public class Dartgame {
	public static int Single(int num) {
		return num;
	}

	public static int Double(int num) {
		return (int) Math.pow(num, 2);
	}

	public static int Triple(int num) {
		return (int) Math.pow(num, 3);
	}

	public static String charstr(char c) {
		return String.valueOf(c);
	}

	public static int dart(String s) {
		int[] result = new int[3];
		int count = 0;
		int num = 0;
		char bonus = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (isInteger(charstr(s.charAt(i)))) {
				if (isInteger(charstr(s.charAt(i + 1)))) {
					num = Integer.parseInt(s.substring(i, i + 2));
					bonus = s.charAt(i + 2);
					i++;
				} else {
					bonus = s.charAt(i + 1);
					num = (int) s.charAt(i) - 48;
				}
				switch (bonus) {
				case 'S':
					result[count] = Single(num);
					break;
				case 'D':
					result[count] = Double(num);
					break;
				case 'T':
					result[count] = Triple(num);
					break;
				default:
					break;
				}
				count++;
			} else {
				if (charstr(s.charAt(i)).equals("*")) {
					int star = 0;
					for (int j = count - 1; j >= 0; j--) {
						if (star == 2)
							break;
						result[j] *= 2;
						star++;
					}
				} else if (charstr(s.charAt(i)).equals("#")) {
					result[count - 1] *= -1;
				}
			}
		}
		int finalresult = result[0] + result[1] + result[2];
		return finalresult;
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println(" 점수 | 보너스 | (옵션) | 종료(-1)");
		System.out.println("-----------------------------------");
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("입력 > ");
			String str = scan.nextLine();
			if (str.equals("-1")) {
				System.out.println("게임 종료");
				run = false;
			}
			int result = dart(str);
			System.out.println("점수 > " + result + "\n");
		}
	}

}
