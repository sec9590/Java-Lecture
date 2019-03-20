package section13.ex02_constructor.package2;

import section13.ex02_constructor.package1.*;

public class C {
	//필드
			A a1 = new A(true); //public접근 가능
//			A a2 = new A(1); -> default 생성자 다른 패키지 접근 가능
//			A a3 = new A("문자열"); -> private 생성자 모든 외부 클래스 접근 불가.
}
