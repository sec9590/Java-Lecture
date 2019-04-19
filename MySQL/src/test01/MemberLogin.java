package test01;

import java.util.Scanner;

public class MemberLogin {
	
	static Scanner scan = new Scanner(System.in);
	static MemberDAO mDao = new MemberDAO();

	public static void login() {
		System.out.print("아이디 > ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("비밀번호 > ");
		String password = scan.nextLine();
		int result = mDao.verifyIdPassword(id, password);

		switch (result) {
		case MemberDAO.ID_PASSWORD_MATCH:
			System.out.println("로그인 성공");
			break;
		case MemberDAO.ID_DOES_NOT_EXIST:
			System.out.println("아이디가 존재하지 않습니다.");
			break;
		case MemberDAO.PASSWORD_IS_WRONG:
			System.out.println("비밀번호가 틀렸습니다.");
			break;
		case MemberDAO.DATABASE_ERROR:
			System.out.println("데이터베이스 오류.");
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("로그인하세요.");
		login();
	}
}
