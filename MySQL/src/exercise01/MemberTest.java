package exercise01;

import java.util.List;
import java.util.Scanner;

public class MemberTest {
	static Scanner scan = new Scanner(System.in);
	static MemberDAO mDao = new MemberDAO();

	public static void insert() {
		System.out.print("패스워드 > ");
		String password = scan.nextLine();
		System.out.print("이름 > ");
		String name = scan.nextLine();
		System.out.print("생일 > ");
		String birthday = scan.nextLine();
		System.out.print("주소 > ");
		String address = scan.nextLine();

		mDao.insertMember(new MemberDTO(password, name, birthday, address));
		selectAll();

	}

	public static void delete() {
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.selectOne(id);
		mDao.deleteMember(member);
		selectAll();

	}

	public static void selectAll() {
		List<MemberDTO> memberlist = mDao.selectAll();
		for (MemberDTO member : memberlist) {
			System.out.println(member.toString());
		}
	}

	public static void update() {
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		MemberDTO member = mDao.selectOne(id);

		System.out.print("패스워드 > ");
		String password = scan.nextLine();
		member.setPassword(password);
		System.out.print("이름 > ");
		String name = scan.nextLine();
		member.setName(name);
		System.out.print("생일 > ");
		String birthday = scan.nextLine();
		member.setBirthday(birthday);
		System.out.print("주소 > ");
		String address = scan.nextLine();
		member.setAddress(address);

		mDao.updateMember(member);
		System.out.println(member.toString());
	}

	public static void selectname() {
		System.out.print("이름 > ");
		String name = scan.nextLine();
		List<MemberDTO> memberlist = mDao.selectMemberName(name);
		for (MemberDTO member : memberlist) {
			System.out.println(member.toString());
		}
	}

	public static void isValid() {
		int no = 0;
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드 > ");
		String password = scan.nextLine();

		List<MemberDTO> memberlist = mDao.selectAll();
		for (MemberDTO member : memberlist) {
			if (id == member.getId()) {
				no = 0;
				if (password.equals(member.getPassword())) {
					System.out.println("id와 비밀번호가 일치합니다.");					
					break;
				} else {
					System.out.println("id와 비밀번호가 일치하지 않습니다.");					
					break;
				}
			} else
				no++;
		}
		if (no > 0)
			System.out.println("id가 존재하지 않습니다.");
	}
	
	public static void login() {
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드 > ");
		String password = scan.nextLine();	
		int result = mDao.verifyIdPassword(id, password);
		
		switch (result) {
		case MemberDAO.ID_PASSWORD_MATCH:
			System.out.println("로그인 성공");
			break;
		case MemberDAO.ID_DOES_NOT_EXIST:
			System.out.println("Id가 존재하지 않습니다.");
			break;
		case MemberDAO.PASSWORD_IS_WRONG:
			System.out.println("Password가 틀렸습니다.");
			break;
		case MemberDAO.DATABASE_ERROR:
			System.out.println("데이터베이스 오류.");
			break;
		}
		
	}
}
