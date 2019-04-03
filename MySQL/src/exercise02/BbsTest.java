package exercise02;

import java.util.List;
import java.util.Scanner;

import exercise01.MemberDAO;
import exercise01.MemberDTO;

public class BbsTest {
	static Scanner scan = new Scanner(System.in);
	static BbsDAO bDao = new BbsDAO();
	static MemberDAO mDao = new MemberDAO();
	
	public static void write() {
		BbsDTO bDto = new BbsDTO();
		bDto.setMemberId(login().getId());
		System.out.print("제목 > ");
		String title = scan.nextLine();
		bDto.setTitle(title);
		System.out.print("내용 > ");
		String content = scan.nextLine();
		bDto.setContent(content);
		
		bDao.insertBbs(bDto);		
	}
	
	public static void selectAll() {
		List<BbsDTO> bDtolist = bDao.selectAll();
		for (BbsDTO bDto : bDtolist) {
			System.out.println(bDto.toString());
		}
	}
	
	public static void update() {		
		BbsDTO bDto = new BbsDTO();
		bDto.setMemberId(login().getId());
		
		System.out.print("제목 > ");
		String title = scan.nextLine();
		bDto.setTitle(title);
		System.out.print("내용 > ");
		String content = scan.nextLine();
		bDto.setContent(content);		

		bDao.updateBbs(bDto);
		
	}
	
	public static void delete() {
		System.out.print("ID > ");
		int memberid = Integer.parseInt(scan.nextLine());
		BbsDTO bDto = bDao.selectOne(memberid);
		bDao.deleteBbs(bDto);
		selectAll();

	}
	
	public static void selectmemberid() {
		System.out.print("ID > ");
		int memberid = Integer.parseInt(scan.nextLine());
		 List<BbsDTO> bDtolist = bDao.selectMemberId(memberid);
			for (BbsDTO bDto : bDtolist) {
				System.out.println(bDto.toString());
			}
	}
	
	public static MemberDTO login() {
		
		System.out.print("ID > ");
		int id = Integer.parseInt(scan.nextLine());
		System.out.print("패스워드 > ");
		String password = scan.nextLine();
		
		MemberDTO member = mDao.selectOne(id);
		
		if(member.getPassword().equals(password)) {
			System.out.println("로그인성공");
			return member;
		}else {
			System.out.println("로그인 실패");
			return login();
		}	
	}
	
}
