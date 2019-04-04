package exercise02;

import java.util.List;
import java.util.Scanner;

import exercise01.MemberDAO;
import exercise01.MemberDTO;

public class BbsTest {
	static Scanner scan = new Scanner(System.in);
	static BbsDAO bDao = new BbsDAO();
	static MemberDAO mDao = new MemberDAO();

	// 쓰기
	public static void write(MemberDTO member) {
		BbsDTO bDto = new BbsDTO();
		
		bDto.setMemberId(member.getId());
		System.out.print("제목 > ");
		String title = scan.nextLine();
		bDto.setTitle(title);
		System.out.print("내용 > ");
		String content = scan.nextLine();
		bDto.setContent(content);

		bDao.insertBbs(bDto);
	}

	// 조회
	public static void selectAll() {
		List<BbsDTO> list = bDao.selectAll();
		for (BbsDTO bDto : list) {
			System.out.println(bDto.toString());
		}
	}

	// 변경
	public static void update(MemberDTO member) {
		System.out.print("변경할 Bbs id > ");
		int id = Integer.parseInt(scan.nextLine());		
		BbsDTO bDto = bDao.selectOne(id);
		
		//로그인한 아이디와 변경할id의 아이디와 일치하면
		if (member.getId() == bDto.getMemberId()) {
			System.out.print("제목 > ");
			String title = scan.nextLine();
			bDto.setTitle(title);
			System.out.print("내용 > ");
			String content = scan.nextLine();
			bDto.setContent(content);
			
			bDao.updateBbs(bDto);
		} else
			System.out.println("** " + member.getId() + " 본인 것만 변경 가능 **");		
	}

	// 삭제
	public static void delete(MemberDTO member) {
		System.out.print("Bbs id > ");
		int id = Integer.parseInt(scan.nextLine());
		BbsDTO bDto = bDao.selectOne(id);
		
		//로그인한 아이디와 변경할id의 memberid와 일치하면
		if (bDto.getMemberId() == member.getId()) {
			bDao.deleteBbs(bDto);
		} else
			System.out.println("** " + member.getId() + " 본인 것만 삭제 가능 **");
		
		selectAll();
	}

	// 상세조회
	public static void selectmemberid() {
		System.out.print("Bbs id > ");
		int id = Integer.parseInt(scan.nextLine());		
		BbsDTO bDto = bDao.selectMemberId(id);
		
		System.out.println("제목 : " + bDto.getTitle());
		System.out.println("글쓴이 : " + bDto.getName());
		System.out.println("최종수정날짜 : " + bDto.getDate());
		System.out.println("내용 : " + bDto.getContent());
	}

	public static MemberDTO login() {
		int no = 0;
		System.out.println("----------------");
		System.out.println("     로그인     ");
		System.out.println("----------------");
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("PW > ");
		String password = scan.nextLine();

		List<MemberDTO> memberlist = mDao.selectAll();
		for (MemberDTO member : memberlist) {
			if (id == member.getId()) {
				no = 0;
				if (password.equals(member.getPassword())) {
					System.out.println("로그인 성공!");
					return member;
				} else {
					System.out.println("id와 비밀번호가 일치하지 않습니다.");
					return login();
				}
			} else
				no++;
		}
		
		if (no > 0) {
			System.out.println("id가 존재하지 않습니다.");
			return login();
		}
		
		bDao.close();
		return null;
		
	}

}
