package exercise01;

import java.util.Scanner;

public class MemberApplication {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		boolean run = true;
		
		while (run) {
			System.out.print("\n[회원메뉴] 1. 가입 | 2. 조회 | 3. 변경 | 4. 삭제 | 5. 검색 | 6. 종료 | 7. 로그인 > ");
			int num = Integer.parseInt(scan.nextLine());
			
			switch (num) {
			case 1:
				MemberTest.insert();
				break;

			case 2:
				MemberTest.selectAll();
				break;

			case 3:
				MemberTest.update();
				break;

			case 4:
				MemberTest.delete();
				break;

			case 5:
				MemberTest.selectname();
				break;

			case 6:
				run = false;
				System.out.println("종료합니다.");
				break;

			case 7:
				MemberTest.login();
				break;
			}
		}
	}

}
