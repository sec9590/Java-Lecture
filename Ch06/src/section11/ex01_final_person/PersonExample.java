package section11.ex01_final_person;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		System.out.println();
		
		//p1.nation = "usa"; 수정 불가
		//p1.ssn = "654321-7654321";
				p1.name = "김자바";
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
	}

}
