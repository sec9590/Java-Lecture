package section04;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println("< '==' 번지수 비교>");
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		
		System.out.println("< 'equals' 문자열 자체 비교>");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}
