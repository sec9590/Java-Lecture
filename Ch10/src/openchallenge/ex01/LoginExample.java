package openchallenge.ex01;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("PassWord : ");
		String password = scan.nextLine();

		try {
			login(id, password);

		} catch (InvalidLoginIdException | IncorrectPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws InvalidLoginIdException, IncorrectPasswordException {
		String[] loginIds = { "abcde", "fghij", "klmno", "pqrst", "uvwxyz" };
		String[] passwords = { "abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12" };
		boolean idvalid = false;
		boolean pwdvalid = false;

		for (int i = 0; i < loginIds.length; i++) {
			if (!id.equals(loginIds[i])) {
				if (i == 4)
					throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
				else
					continue;
			} else {
				idvalid = true;
				break;
			}
		}

		for (int i = 0; i < loginIds.length; i++) {
			if (!password.equals(passwords[i])) {
				if (i == 4)
					throw new IncorrectPasswordException("패스워드를 잘못 입력하였습니다.");
				else
					continue;
			} else {
				pwdvalid = true;
				break;
			}
		}

		if (idvalid && pwdvalid) {
			for (int i = 0; i < loginIds.length; i++) {
				if (id.equals(loginIds[i]) && password.equals(passwords[i])) {
					System.out.println("로그인 성공");
					break;
				}
			}
		}
	}

}
