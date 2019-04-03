package exercise02;

import java.util.Scanner;

public class BbsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		boolean run = true;
		
		while (run) {
			System.out.print("\n[회원메뉴] 1. 쓰기 | 2. 조회 | 3. 변경 | 4. 삭제 | 5. 상세조회 | 6. 종료 | 7. 로그인 > ");
			int num = Integer.parseInt(scan.nextLine());
			
			switch (num) {
			case 1:
				BbsTest.write();
				break;

			case 2:
				BbsTest.selectAll();
				break;

			case 3:
				BbsTest.update();
				break;

			case 4:
				BbsTest.delete();
				break;

			case 5:
				BbsTest.selectmemberid();
				break;

			case 6:
				run = false;
				System.out.println("종료합니다.");
				break;

			case 7:
				BbsTest.login();
				break;
			}
		}

	}

}
