package section09;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		//문자열 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//4번째 문자 2를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//4번째 문자를 6으로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//6번째 문자부터 12번째 문자까지를 변경
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//4번째 문자 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자 수 : " + length);
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
