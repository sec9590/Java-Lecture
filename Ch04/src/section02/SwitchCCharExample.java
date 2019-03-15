package section02;

public class SwitchCCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch (grade) { //대문자든 소문자든 관계 없다.
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다. ");			
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다. ");			
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}

	}

}
