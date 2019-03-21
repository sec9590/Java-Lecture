package exercise.customer;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("name > ");
		String name = scan.nextLine();
		System.out.print("tel > ");
		String tel = scan.nextLine();
		System.out.print("address > ");
		String address = scan.nextLine();
		System.out.print("number > ");
		String number = scan.nextLine();
		System.out.print("point > ");
		int point = Integer.parseInt(scan.nextLine());
		System.out.println();

		Member member = new Member(name, tel, address, number, point);

		member.print();

	}

}
