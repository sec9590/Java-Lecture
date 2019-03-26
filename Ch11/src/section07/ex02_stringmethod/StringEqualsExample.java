package section07.ex02_stringmethod;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String객체 참조");
		} else {
			System.out.println("다른 String객체 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}
	}

}
