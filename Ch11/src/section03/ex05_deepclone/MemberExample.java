package section03.ex05_deepclone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		//깊은 복제후 참조 객체 데이터 변경
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";

		System.out.println("[복제 객체의 필드 값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.println("scores : " + Arrays.toString(cloned.scores));
		System.out.println("car : " + cloned.car.model);
		System.out.println();

		System.out.println("[원본 객체의 필드 값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.println("scores : " + Arrays.toString(original.scores));
		System.out.println("car : " + original.car.model);

	}

}
