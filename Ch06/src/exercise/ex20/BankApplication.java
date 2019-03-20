package exercise.ex20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		System.out.println("----------");
		System.out.println(" 계좌생성 ");
		System.out.println("----------");

		System.out.print("계좌번호 > ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 > ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액 > ");
		int balance = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("----------");
		System.out.println(" 계좌목록 ");
		System.out.println("----------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " "
						+ accountArray[i].getBalance());
			}
		}
	}

	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano))
					account = accountArray[i];
			}
		}
		return account;
	}
	
	private static void deposit() {

		System.out.println("------");
		System.out.println(" 예금 ");
		System.out.println("------");

		System.out.print("계좌번호 > ");
		String ano = scanner.nextLine();
		System.out.print("예금액 > ");
		int balance = Integer.parseInt(scanner.nextLine());

		Account account = findAccount(ano);
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금이 성공되었습니다.");

	}

	private static void withdraw() {
		System.out.println("------");
		System.out.println(" 출금 ");
		System.out.println("------");

		System.out.print("계좌번호 > ");
		String ano = scanner.nextLine();
		System.out.print("출금액 > ");
		int balance = Integer.parseInt(scanner.nextLine());

		Account account = findAccount(ano);
		if (account.getBalance() < balance) {
			System.out.println("출금이 실패하였습니다.");
		} else {
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 성공되었습니다.");
		}
	}

}
