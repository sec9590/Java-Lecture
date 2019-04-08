package practice05_190408.ex02;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("홍길동", "kdhong", "12345", 30);
		Member m2 = new Member("김자바", "javakim", "java", 24);
		
		System.out.println("[m1, m2의 나이비교]");
		int result = m1.compareTo(m2);
		
		if(result > 0) {
			System.out.print("m1의 나이가 더 많습니다.");
		} else if(result == 0) {
			System.out.print("m1과 m2의 나이는 같습니다.");
		} else {
			System.out.print("m2의 나이가 더 많습니다.");
		}
		System.out.println(" -> " + result );
		
		
	}

}
